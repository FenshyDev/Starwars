package model;

public class ShopService {
	Invoice invoice = new Invoice();
	public ShopService(){
	}

	public String getTotalPriceOverview() {
		return "€"+invoice.getPrice();
	}

	public void invoiceListAddProduct(int quantity, Product product) {
		Order order = new Order(quantity,product);
		invoice.addProductOrder(order);
	}
	
}