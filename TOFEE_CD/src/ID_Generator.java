/**
 * The type Id generator.
 */
public class ID_Generator {

	private String s;
	private int i;

	/**
	 * Instantiates a new Id generator.
	 */
	public ID_Generator() {}

	/**
	 * Instantiates a new Id generator.
	 *
	 * @param _s the s
	 * @param _i the
	 */
	public ID_Generator(String _s, int _i) {
		s = _s;
		i = _i;
	}


	/**
	 * Gets s.
	 *
	 * @return the s
	 */
	public String getS() {
		return this.s;
	}

	/**
	 * Sets s.
	 *
	 * @param s the s
	 */
	public void setS(String s) {
		this.s = s;
	}

	/**
	 * Gets i.
	 *
	 * @return the i
	 */
	public int getI() {
		return this.i;
	}

	/**
	 * Sets i.
	 *
	 * @param i the
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * Next label string user
	 *
	 * @return the string
	 */
	public String next_Label_user() {
		Connect c = new Connect("UsersData");
		String Full_id = c.getLastUserId();
		s = String.valueOf(Full_id.charAt(0));
		i = Integer.parseInt(Full_id.substring(1,Full_id.length()))+1;
		String s1 = s + Integer.toString(i);
		return s1;
	}

	/**
	 * Next label string item
	 *
	 * @return the string
	 */
	public String next_Label_item() {
		Connect c = new Connect("Items");
		String Full_id = c.getLastUserId();
		s = String.valueOf(Full_id.charAt(0));
		i = Integer.parseInt(Full_id.substring(1,Full_id.length()))+1;
		String s1 = s + Integer.toString(i);
		return s1;
	}

	/**
	 * Next label string category
	 *
	 * @return the string
	 */
	public String next_Label_category() {
		Connect c = new Connect("categories");
		String Full_id = c.getLastUserId();
		s = String.valueOf(Full_id.charAt(0));
		i = Integer.parseInt(Full_id.substring(1,Full_id.length()))+1;
		String s1 = s + Integer.toString(i);
		return s1;
	}

	/**
	 * Next label string order
	 *
	 * @return the string
	 */
	public String next_Label_order() {
		Connect c = new Connect("orders");
		String Full_id = c.getLastUserId();
		s = String.valueOf(Full_id.charAt(0));
		i = Integer.parseInt(Full_id.substring(1,Full_id.length()))+1;
		String s1 = s + Integer.toString(i);
		return s1;
	}

	/**
	 * Current label string user
	 *
	 * @return the string
	 */
	public String current_label_user() {
		Connect c = new Connect("UsersData");
		String Full_id = c.getLastUserId();
		return Full_id;
	}

	/**
	 * Current label string item
	 *
	 * @return the string
	 */
	public String current_label_item() {
		Connect c = new Connect("Items");
		String Full_id = c.getLastUserId();
		return Full_id;
	}

	/**
	 * Current label string category
	 *
	 * @return the string
	 */
	public String current_label_category() {
		Connect c = new Connect("categories");
		String Full_id = c.getLastUserId();
		return Full_id;
	}

	/**
	 * Current label string order
	 *
	 * @return the string
	 */
	public String current_label_order() {
		Connect c = new Connect("orders");
		String Full_id = c.getLastUserId();
		return Full_id;
	}


}