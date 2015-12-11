package model;

import java.util.ArrayList;
import java.util.List;
import model.Order;
public class Invoice {
	private List<Order> orders;
	
	public Invoice(){
		this.orders = new ArrayList<Order>();
	}
	
	public void addProductOrder(Order order){
		orders.add(order);
	}
	public double getPrice(){
		double total = 0;
		for(Order order : orders){
			total += order.getPrice();
		}
		return total;
	}
}
