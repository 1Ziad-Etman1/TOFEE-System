import java.util.ArrayList;

/**
 * The type Client.
 */
public class Client extends User {

	private ArrayList<Order> orderHistory;
	private int loyalty_points;

	private void updateLoyalPoints() {
		// TODO - implement client.updateLoyalPoints
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets order.
	 *
	 * @param id the id
	 * @return the order
	 */
	public Order getOrder(String id) {
		// TODO - implement client.getOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * Add order.
	 */
	public void addOrder() {
		// TODO - implement client.addOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * Add item to order.
	 */
	public void addItemToOrder() {
		// TODO - implement client.addItemToOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * Remove item from order.
	 */
	public void removeItemFromOrder() {
		// TODO - implement client.removeItemFromOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * Re order.
	 *
	 * @param orderId the order id
	 */
	public void reOrder(String orderId) {
		// TODO - implement client.reOrder
		throw new UnsupportedOperationException();
	}

	/**
	 * Show history string.
	 *
	 * @return the string
	 */
	public String showHistory() {
		// TODO - implement client.showHistory
		throw new UnsupportedOperationException();
	}

	/**
	 * Show loyal points int.
	 *
	 * @return the int
	 */
	public int showLoyalPoints() {
		return loyalty_points;
	}

}