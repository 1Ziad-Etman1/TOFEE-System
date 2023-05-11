import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The type Payment system.
 */
public class Payment_System { // DONE

	private float price;
	private float remain_price;
	private float cash_money;
	private float s_wallet_money;
	private float gift_voucher_money;
	private float loyalty_points_money;
	private ArrayList<Boolean> payWays; // 0: Cash 1: Smart_Wallets 2: Loyalty_Points 3: Gift_Voucher

	/**
	 * Instantiates a new Payment system.
	 */
	public Payment_System() {
		price = 0;
		cash_money = 0;
		s_wallet_money = 0;
		gift_voucher_money = 0;
		loyalty_points_money = 0;
		remain_price = price;
		payWays = new ArrayList<Boolean>(Arrays.asList(false, false, false, false));
	}

	/**
	 * Instantiates a new Payment system.
	 *
	 * @param price the price
	 */
	public Payment_System(float price) {
		this.price = price;
		remain_price = price;
		cash_money = 0;
		s_wallet_money = 0;
		gift_voucher_money = 0;
		loyalty_points_money = 0;


		payWays = new ArrayList<Boolean>(Arrays.asList(false, false, false, false));

	}

	/**
	 * Check valid payways boolean.
	 *
	 * @param pw the pw
	 * @return the boolean
	 */
	public boolean check_valid_payways(String pw){
		if(pw == null) return false;

		if(pw.length() != 4) return false;

		if((pw.charAt(0)!='0' && pw.charAt(0)!='1') ||
			(pw.charAt(1)!='0' && pw.charAt(1)!='1') ||
			(pw.charAt(2)!='0' && pw.charAt(2)!='1') ||
			(pw.charAt(3)!='0' && pw.charAt(3)!='1')) {

				return false;
		}

		if (pw.charAt(0) == '1' && pw.charAt(1) == '1'){
			System.out.println("you can't pay with cash and smart wallet in the same time!\n");
			return false;
		}

		return true;
	}

	/**
	 * Interface.
	 */
	public void Interface(){
		Scanner in = new Scanner(System.in);
		String payways01 = "0";
		System.out.println(
				"Welcome to payment system !\n\n" +
				"The price is: "+ price + '\n' +
				"you want to pay with 1-cash 2-smart wallet 3-loyalty points 4-gift voucher\n" +
				"(Note you have to input something like 0011 means 1 if you use the pay method 0 if not)\n" +
				"your payment methods: "
		);
		payways01 = in.next();

		while (!check_valid_payways(payways01)){
			System.out.println("Wrong input \n Enter your payways: ");
			payways01 = in.next();
		}

		if (payways01.charAt(0) == '1'){
			float cashMoney;
			System.out.println("how much money you wanna pay cash ? ");
			cashMoney = in.nextFloat();

			while (!(cashMoney <= price && cashMoney > 0)){
				System.out.println("invalid input!\n");
				System.out.println("how much money you wanna pay cash ? ");
				cashMoney = in.nextFloat();
			}
			setCash(cashMoney);
		}
		if (payways01.charAt(1) == '1'){
			float sWallet;
			System.out.println("how much money you wanna pay smart wallet ? ");
			sWallet = in.nextFloat();

			while (!(sWallet <= price && sWallet > 0)){
				System.out.println("invalid input!\n");
				System.out.println("how much money you wanna pay with your Smart wallet ? ");
				sWallet = in.nextFloat();
			}
			setSmart_Wallet(sWallet);
		}
		if (remain_price > 0){
			if (payways01.charAt(2) == '1'){
				float lp;
				System.out.println("how much money you wanna pay loyal points ? ");
				lp = in.nextFloat();

				while (!(lp <= remain_price && lp > 0)){
					System.out.println("invalid input!\n");
					System.out.println("how much money you wanna pay with your Loyal Points ? ");
					lp = in.nextFloat();
				}
				setLoyalPoints(lp);
			}
			if (remain_price > 0){
				if (payways01.charAt(3) == '1'){
					float gv;
					System.out.println("how much money you wanna pay gift voucher ? ");
					gv = in.nextFloat();

					while (!(gv <= remain_price && gv > 0)){
						System.out.println("invalid input!\n");
						System.out.println("how much money you wanna pay with your Gift Voucher ? ");
						gv = in.nextFloat();
					}
					setGiftVoucher(gv);
				}
			} else {
				String pw = payways01.substring(0, 2) + "0";
				payways01 = pw;
			}
		} else {
			String pw = payways01.substring(0, 2) + "00";
			payways01 = pw;
		}

		System.out.println("\n\nyour Reset.. \n" + getReceipt());
	}

	/**
	 * Sets price.
	 *
	 * @param price the price
	 */
	public void setPrice(float price) {
		this.price = price;
		this.remain_price = price;
	}

	/**
	 * Sets cash.
	 *
	 * @param cashMoney the cash money
	 */
	public void setCash(float cashMoney) {
		if (cashMoney > 0 && cashMoney < remain_price){
			payWays.set(0,true);
		}
		cash_money = cashMoney;
		remain_price -= cash_money;
	}

	/**
	 * Sets smart wallet.
	 *
	 * @param sWalletMoney the s wallet money
	 */
	public void setSmart_Wallet(float sWalletMoney) {
		if (sWalletMoney > 0){
			payWays.set(1,true);
		}
		s_wallet_money = sWalletMoney;
		remain_price -= s_wallet_money;
	}

	/**
	 * Sets loyal points.
	 *
	 * @param loyaltyPointsMoney the loyalty points money
	 */
	public void setLoyalPoints(float loyaltyPointsMoney) {
		if (loyaltyPointsMoney > 0){
			payWays.set(2,true);
		}
		loyalty_points_money = loyaltyPointsMoney;
		this.remain_price -= loyalty_points_money;
	}

	/**
	 * Sets gift voucher.
	 *
	 * @param giftVoucherMoney the gift voucher money
	 */
	public void setGiftVoucher(float giftVoucherMoney) {
		if (giftVoucherMoney > 0){
			payWays.set(3,true);
		}
		gift_voucher_money = giftVoucherMoney;
		this.remain_price -= gift_voucher_money;
	}

	/**
	 * Gets reset.
	 *
	 * @return the reset
	 */
	public String getReceipt() {
		String reset = "";
		if (cash_money > 0){
			reset   = "the price of your order is: " + price + "\n\n"
					+ "you paid: \n"
					+ "cash: " + cash_money + '\n'
					+ "loyalty points: " + loyalty_points_money + '\n'
					+ "gift voucher: " + gift_voucher_money + "\n"
					+ "the remaining money: " + remain_price + "\n\n";
		} else if (s_wallet_money > 0) {
			reset   = "the price of your order is: " + price + "\n\n"
					+ "you paid: \n"
					+ "Smart Wallet: " + s_wallet_money + '\n'
					+ "loyalty points: " + loyalty_points_money + '\n'
					+ "gift voucher: " + gift_voucher_money + '\n'
					+ "the remaining money: " + remain_price + "\n\n";
		} else {
			reset   = "the price of your order is: " + price + "\n\n"
					+ "you paid: \n"
					+ "loyalty points: " + loyalty_points_money + '\n'
					+ "gift voucher: " + gift_voucher_money + '\n'
					+ "the remaining money: " + remain_price + "\n\n";
		}


		return reset;
	}

	/**
	 * Get pay ways string.
	 *
	 * @return the string
	 */
	public String getPayWays (){
		String ways = "";
		if (payWays.get(0)){
			ways += "cash,";
		}
		if (payWays.get(1)){
			ways += "smartWallet,";
		}
		if (payWays.get(2)){
			ways += "loyaltyPoints,";
		}
		if (payWays.get(3)){
			ways += "giftVoucher,";
		}
		ways = ways.substring(0,(ways.length()-1));

		return ways;
	}

	/**
	 * Get pay amounts string.
	 *
	 * @return the string
	 */
	public String getPayAmounts (){
		String amounts = "";
		if (payWays.get(0)){
			amounts = amounts + ',' +  Float.toString(cash_money);
		}
		if (payWays.get(1)){
			amounts = amounts + ',' +  Float.toString(s_wallet_money);
		}
		if (payWays.get(2)){
			amounts = amounts + ',' +  Float.toString(loyalty_points_money);
		}
		if (payWays.get(3)){
			amounts = amounts + ',' +  Float.toString(gift_voucher_money);
		}
		amounts = amounts.substring(1, amounts.length()-1);

		return amounts;

	}

}