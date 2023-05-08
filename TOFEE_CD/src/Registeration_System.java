import java.io.IOException;
import java.util.Scanner;

/**
 * The type Registeration system.
 */
public class Registeration_System {

	private String id;
	private String name;
	private String userName;
	private String email;
	private String password;
	private String phoneNum;
	private String address;



	public  Interface(){
		Scanner in = new Scanner(System.in);
		System.out.println("\t\t\t\tRegistration\n" +
				"Welcome to TOFEE-System\n" +
				"Please Enter your name: ");
		name = in.next();

		System.out.println("Enter your username: ");
		userName = in.next();

		System.out.println("Enter your email: ");
		email = in.next();

		while (checkMail()){
			System.out.println("Sorry this mail is used registered alreadyn\n" +
					"Enter other email: ");
			email = in.next();
		}

		System.out.println("Enter your password(at least 8 chars): ");
		password = in.next();

		while (password.length()<8){
			System.out.println("your password must be 8 chars at least!!\nEnter your password: ");
			password = in.next();
		}

		System.out.println("Enter your Phone number: ");
		phoneNum = in.next();

		System.out.println("Enter your address: ");
		address = in.next();

		Connect c = new Connect("UsersData");
		c.insertInAuthTable("u26", name, userName, email, password, phoneNum, address,"client");

	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return this.email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
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

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets phone num.
     *
     * @return the phone num
     */
    public String getPhoneNum() {
		return this.phoneNum;
	}

    /**
     * Sets phone num.
     *
     * @param phoneNum the phone num
     */
    public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Check email boolean.
     *
     * @return the boolean
     */
    public Boolean checkMail() {
		// TODO - implement Registeration_System.checkMail-Search-For-Its-Regex-IMPORTANT
		throw new UnsupportedOperationException();
	}

    /**
     * Verify email.
     */

    public Boolean verifyMail() {
		Connect c = new Connect("UsersData");
		return c.checkMail(email);
	}

	public void clearConsole() {
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

    /**
     * Gets the client.
     *
     * @return the the client
     */
    public Client getTheClient() {
		// TODO - implement Registeration_System.getTheClient
		throw new UnsupportedOperationException();
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



}