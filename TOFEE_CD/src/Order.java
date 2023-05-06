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
    public String getItem(String itemName) {
		// TODO - implement Order.getItem
		return "Item: " + itemName;
	}

    /**
     * performs an operation
     */
    public void operation() {
		// TODO - implement Order.operation
		System.out.println("Performing an operation");
	}

}
