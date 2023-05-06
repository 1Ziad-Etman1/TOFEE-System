
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
     * @return the item
     */
    public Item getItem() {
		// TODO - implement Category.getItem
		throw new UnsupportedOperationException();
	}

    /**
     * Add item.
     */
    public void addItem() {
		// TODO - implement Category.addItem
		throw new UnsupportedOperationException();
	}

    /**
     * Delete item.
     *
     * @param itemId the item id
     */
    public void deleteItem(String itemId) {
		// TODO - implement Category.deleteItem
		throw new UnsupportedOperationException();
	}

}