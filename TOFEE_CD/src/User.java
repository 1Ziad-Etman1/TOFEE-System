/**
 * The type User.
 */
public abstract class User {

	private String id;
	private String name;
	private String username;
	private String email;
	private String password;
	private String phoneNum;
	private String address;

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
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
		return this.username;
	}

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
		this.username = username;
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

}