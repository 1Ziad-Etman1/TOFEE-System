import java.util.Scanner;

/**
 * The type Order.
 */
public class Order {

	private String id;
	private String clientId;
	private Payment_System paymentMethod;
	private String address;
	private float itemsAmounts;


	/**
	 * Instantiates a new Order.
	 */
	public Order(){}

	/**
	 * Instantiates a new Order.
	 *
	 * @param id the id
	 */
	public Order(String id){
		clientId = id;
	}

	/**
	 * Interface.
	 */
	public void Interface(){

		Scanner in = new Scanner(System.in);
		Connect c = new Connect("Items");
		System.out.println("\t\t\tTOFEE-System\n" +
				"Welcome to order system\n");
		System.out.println("Enter the address: ");
		address = in.next();
		System.out.println("our products\n");
		show_products();


		String items_ids = "";
		String new_id = "";
		String item_amounts = "";
		float new_amount = 0 ;
		float price = 0;
		int choice = 0;
		while (choice != 2){
			System.out.print("Enter the id of item you want: ");
			new_id = in.next();
			System.out.print("how much do you want to add? ");
			new_amount = in.nextFloat();
			price = price + new_amount * c.getPriceById(new_id);
			items_ids = items_ids + ',' + new_id;
			item_amounts = item_amounts + ',' + Float.toString(new_amount);
			System.out.print("Do you want to add more items?\n" +
					"1-Yes\n" +
					"2-No\n" +
					"Your choice: ");
			choice = in.nextInt();
			while (choice != 1 && choice != 2){
				System.out.println("Wrong input");
				System.out.print("Do you want to add more items?\n" +
						"1-Yes\n" +
						"2-No\n" +
						"Your choice: ");
				choice = in.nextInt();
			}

		}
		items_ids = items_ids.substring(1,items_ids.length());
		item_amounts = item_amounts.substring(1,item_amounts.length());

		Payment_System p = new Payment_System(price);
		p.Interface();


		ID_Generator d = new ID_Generator();
		Connect c2 = new Connect("orders");
		c2.insertInOrdersTable(d.next_Label_order(),clientId,address,items_ids,item_amounts,p.getPayWays(),p.getPayAmounts(),price);
		throw new UnsupportedOperationException();
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
	 * Gets client id.
	 *
	 * @return the client id
	 */
	public String getClientId() {
		return this.clientId;
	}

	/**
	 * Sets client id.
	 *
	 * @param clientId the client id
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * Gets payment method.
	 *
	 * @return the payment method
	 */
	public Payment_System getPaymentMethod() {
		return this.paymentMethod;
	}

	/**
	 * Sets payment method.
	 *
	 * @param paymentMethod the payment method
	 */
	public void setPaymentMethod(Payment_System paymentMethod) {
		this.paymentMethod = paymentMethod;
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
	 * Gets item.
	 *
	 * @param itemName the item name
	 * @return Item name
	 */
	public void getItem(String itemName) {
		Connect c = new Connect("Items");
		c.search_viewByName(itemName);
	}

	/**
	 * Show products.
	 */
	public void show_products(){
		Connect c = new Connect("Items");
		c.selectAll();
		System.out.println("\n");
	}



}
