package MiniOrderSystem.minihandel;

import java.time.LocalDate;
import java.util.*;

/**
 * Models a Customer with Orders.
 */
public class Customer {
	private String name;
	private LocalDate birthday;
	private List<Order> orders = new ArrayList<Order>();
	private Discount discount;

	/**
	 * Create a new Customer.
	 * 
	 * @param name     the name.
	 * @param birthday birthday of the customer.
	 */
	public Customer(String name, LocalDate birthday, Discount discount) {
		this.name = name;
		this.birthday = birthday;
		this.discount = discount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>(orders);
	}

	public void addOrder(Order order) {
		if (!orders.contains(order)) {
			orders.add(order);
		}
	}

	public void removeOrder(Order order) {
		if (orders.contains(order)) {
			orders.remove(order);
		}
	}

	/**
	 * Samler alle ordrene på en kunde og ser hvad der er blevet købt for totalt
	 * @return
	 */
	public double totalBuy(){
		double result = 0;
		for(Order order : orders){
			result += order.getOrderPrice();
		}
		return result;
	}

	public Discount getDiscount(){
		return discount;
	}
	public void setDiscount(Discount discount){
		if(this.discount != discount){
			this.discount = discount;
		}
	}

	/**
	 * Denne metode udregner det totale køb og putter en discount på og minusser det
	 * @return
	 */
	public double totalBuyWithDiscount(){
		return totalBuy() - discount.getDiscount(totalBuy());
	}

}
