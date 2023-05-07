import java.util.Scanner;

/**
 * The type Login system.
 */
public class Login_system {

	private String userName;
	private String password;


	public boolean Interface(){
		Scanner in = new Scanner(System.in);
		System.out.println("\t\t\t\tLogin\nWelcome to TOFEE System\n");
		System.out.println("Please Enter your \nUsername: ");
		userName = in.next();
		System.out.println("Password: ");
		password = in.next();
		if (verifyUname_Password()){
			System.out.println("verified!");
			return true;
		}else {
			System.out.println("Sorry this Uname and password aren't registered yet we will send you to Registration page!");
			return false;
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

    /**
     * Forget password.
     */
    public void forgetPassword() {
		OTPMAIL o = new OTPMAIL();
		//TODO-Continue-Forget-Password
	}

    /**
     * Verify mail password boolean.
     *
     * @return the boolean
     */
    public Boolean verifyUname_Password() {
		Connect c = new Connect("UsersData");
		if (c.checkCredentials(userName, password)){
			return true;
		}
		return false;
	}

    /**
     * Clear data.
     */
    public void clearData() {
		// TODO - implement Login_system.clearData
		throw new UnsupportedOperationException();
	}

}