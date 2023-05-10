
import java.util.ArrayList;

/**
 * The type Category.
 */
public class Category {

	private String name;
	private String id;
	private ArrayList<Item> items;

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
     * Gets items.
     *
     * @return the items
     */
    public ArrayList<Item> getItems() {
		return this.items;
	}

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

    /**
     * Gets item.
     *
     * @param itemName the item name
     * @return the item
     */
    public void getItem(String itemName) {
//		for (Item item: items) {
//				if (item.getName() == itemName){
//					return item ;
//				}
//		}
		Connect c = new Connect("Items");
		c.search_viewByName(itemName);

	}

    /**
     * Add item.
     *
     * @param item the item
     */
    public void addItem(Item item) {
		Connect c = new Connect("Items");
		c.insertInItemsTable(item.getId(),item.getName(),item.getCategoryName(),item.getBarnd(),item.getPrice(),item.getSealedOrLoose(),item.getDiscountPercentage(),item.getAmountInStores(),item.getPoints(),item.getDescription());
	}

    /**
     * Delete item.
     *
     * @param itemId the item id
     */
    public void deleteItem(String itemId) {

//		for (Item item:
//				items) {
//			if (item.getId() == itemId){
//				items.remove(item);
//			}
//		}
//		throw new UnsupportedOperationException();
		Connect c = new Connect("Items");
		c.deleteFromTable(itemId);
	}

}