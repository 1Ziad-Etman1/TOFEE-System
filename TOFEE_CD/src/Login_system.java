import java.util.Scanner;
import java.io.IOException;

/**
 * The type Login system.
 */
public class Login_system {

	private String userName;
	private String password;
	private String email;


	public boolean Interface(){
		Scanner in = new Scanner(System.in);
		while (true){
			System.out.println("\t\t\t\tLogin\nWelcome to TOFEE System\n");
			System.out.println("if you want to clear data and start fill  again write \"clear\"\nPlease Enter your \nUsername: ");
			userName = in.next();
			if (userName == "clear"){
				return clearData();
			}
			System.out.println("Please Enter your \nEmail: ");
			email = in.next();
			if (email == "clear"){
				return clearData();
			}
			System.out.println("Password: ");
			password = in.next();
			if (password == "clear"){
				return clearData();
			}
			if (verifyUname_Password()){
				System.out.println("verified!");
				return true;
			}else {

				System.out.println("Sorry this Uname and password aren't registered \n");
				int fp = 0;
				System.out.println("Did you forget your password?\n" +
						"1-Yes\n" +
						"2-No\n" +
						"Your Choice: ");
				fp = in.nextInt();
				while (fp != 1 || fp != 2){
					System.out.println("wrong input try again\n" +
							"Did you forget your password? \n" +
							"1-Yes\n" +
							"2-No\n" +
							"Your Choice: ");
					fp = in.nextInt();
				}
				if (fp == 1){
					forgetPassword();
				}
				int choice = 0;
				System.out.println("Now what do you wnat to do? \n");
				System.out.println("1-Try to login again \n" +
						"2-Go to register page");
				System.out.println("your choice: ");
				choice = in.nextInt();
				while (choice != 1 || choice != 2){
					System.out.println("Wrong input\n");
					System.out.println("1-Try again\n" +
							"2-Go to register page");
					System.out.println("your choice: ");
					choice = in.nextInt();

					if (choice == 1){
						return clearData();
					} else{
						return false;
					}
				}
			}
		}

	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
		return this.password;
	}

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * Forget password.
     */
    public void forgetPassword() {
		Scanner in = new Scanner(System.in);
		OTPMAIL otp = new OTPMAIL();
		Connect c = new Connect("UsersData");
		clearConsole();
		System.out.println("\t\t\tForget Password");
		while (!verifyMail()){

			System.out.println("Please Enter your email : ");
			email = in.next();
			if(verifyMail()){
				System.out.println("we will send you otp mail now!");
				int otpCode = otp.mn(email);
				System.out.println("Enter the code you received : ");
				int inpt = in.nextInt();
				if (inpt != otpCode){
					while (inpt != otpCode){
						System.out.println("Wrong Code!\n");
						System.out.println("we will send you otp mail again!");
						otpCode = otp.mn(email);
						System.out.println("Enter the code you received : ");
						inpt = in.nextInt();
					}
				}
				//NOW the code is verified and all right

				System.out.println("Enter your new password: ");
				String newPass = in.next();
				String ID = "";
				while (!checkMailAndID(ID)){
					System.out.println("Enter your right ID please: ");
					ID = in.next();
				}

				c.updateTable(ID,"password", newPass);
				System.out.println("Your password changed succesfully!\n");
				break;
			} else {
				System.out.println("Wrong mail try again!\n");
				continue;
			}
		}
		clearConsole();
	}

    /**
     * Verify mail password boolean.
     *
     * @return the boolean
     */
    public Boolean verifyUname_Password() {
		Connect c = new Connect("UsersData");
		if (c.checkCredentials(userName, email, password)){
			return true;
		}
		return c.checkCredentials(userName, email, password);
	}

	public Boolean verifyMail(){
		Connect c = new Connect("UsersData");
		return c.checkMail(email);
	}

	public Boolean checkMailAndID(String ID){
		Connect c = new Connect("UsersData");
		return c.checkMail_ID(ID, email);
	}

	// Clear the console function
	public static void clearConsole() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}
		catch (IOException | InterruptedException ex) {
			ex.printStackTrace();
		}
	}

    /**
     * Clear data.
     */
    public Boolean clearData() {
		clearConsole();
		return Interface();
	}

}