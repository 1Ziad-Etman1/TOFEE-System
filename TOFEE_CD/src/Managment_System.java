import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Managment system.
 */
public class Managment_System {

	private ArrayList<Client> clients;
	private ArrayList<Order> orders;
	private ArrayList<Category> categories;
	private ArrayList<Item> items;


	/**
	 * Interface.
	 */
	public void Interface() {
		Scanner in = new Scanner(System.in);
		System.out.println("\t\t\tTOFEE-System\n" +
				"\n Our Products\n");
		showCatalog();
		int choice = 0;
		System.out.println("what do you want to do?\n" +
				"1-Login\n" +
				"2-Register\n" +
				"your choice: ");
		choice = in.nextInt();
		while (choice !=1 && choice != 2){
			System.out.println("wrong input");
			System.out.println("what do you want to do?\n" +
					"1-Login\n" +
					"2-Register\n" +
					"your choice: ");
			choice = in.nextInt();
		}
		boolean lgn = false;
		Login_system l = new Login_system();
		Registeration_System reg = new Registeration_System();

		if(choice == 1){
			lgn = l.Interface();
		} else {
			reg.Interface();
			Interface();
		}

		if(!lgn){
			reg.Interface();
			Interface();
		}
		System.out.println("Now you are logged in!");
		while (true){
			choice = 0;
			System.out.println(	"\n\nnow do you want to order or search?\n" +
					"1-order\n" +
					"2-search\n" +
					"3-view all items\n" +
					"4-log out");
			choice = in.nextInt();
			while (choice !=1 && choice != 2 && choice != 3 && choice != 4){
				System.out.println("wrong input");
				System.out.println("Now you are logged in!\n" +
						"do you want to order or search?\n" +
						"1-order\n" +
						"2-search\n" +
						"3-view all items" +
						"4-log out");
				choice = in.nextInt();
			}

			if (choice == 1){
				System.out.println("Enter your ID please: ");
				String ID = "xzx";
				ID = in.next();
				while (!l.checkMailAndID(ID)){
					System.out.println("Enter your correct ID please: ");
					ID = in.next();
				}
				Order o = new Order(ID);
				o.Interface();
			} else if (choice == 2) {
				int c=0;
				System.out.println("Do you wanna search by\n" +
						"1-Item name\n" +
						"2-Category name\n" +
						"your choice: ");
				c = in.nextInt();
				while (c !=1 && c != 2){
					System.out.println("Wrong input");
					System.out.println("Do you wanna search by\n" +
							"1-Item name\n" +
							"2-Category name\n" +
							"your choice: ");
					c = in.nextInt();
				}
				if(c == 1){
					String key = "";
					System.out.println("Enter the key word you wanna search with: ");
//					key = in.nextLine();
					searchItem(in.next());
				} else {
					String key = "";
					System.out.println("Enter the key word you wanna search with: ");
//					key = in.nextLine();
					searchCategory(in.next());
				}
			} else if (choice == 3) {
				showCatalog();
			} else {
				break;
			}
		}







		throw new UnsupportedOperationException();
	}

	/**
	 * Show catalog string.
	 *
	 * @return the string
	 */
	public void showCatalog() {
		Connect c = new Connect("Items");
		c.selectAll();
		System.out.println("\n\n");
	}

	/**
	 * Show orders string.
	 *
	 * @return the string
	 */
	public String showOrders() {
		// TODO - implement Managment_System.showOrders
		throw new UnsupportedOperationException();
	}

	/**
	 * Add client.
	 *
	 * @param data the data
	 */
	public void addClient(Client data) {
		// TODO - implement Managment_System.addClient
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets client data.
	 *
	 * @param clientId the client id
	 * @return the client data
	 */
	public String getClientData(String clientId) {
		// TODO - implement Managment_System.getClientData
		throw new UnsupportedOperationException();
	}

	/**
	 * Add order to list.
	 */
	public void addOrderToList() {
		// TODO - implement Managment_System.addOrderToList
		throw new UnsupportedOperationException();
	}

	/**
	 * Modify item amount.
	 *
	 * @param id     the id
	 * @param newVal the new val
	 */
	public void ModifyItemAmount(String id, float newVal) {
		Connect c = new Connect("Items");
		c.updateTable(id,"amountInStores" ,Float.toString(newVal));
	}

	/**
	 * Search category string.
	 *
	 * @param name the name
	 */
	public void searchCategory(String name) {
		Connect c = new Connect("Items");
		c.search_viewByCategory(name);
	}

	/**
	 * Search item string.
	 *
	 * @param name the name
	 */
	public void searchItem(String name) {
		Connect c = new Connect("Items");
		c.search_viewByName(name);
	}

}