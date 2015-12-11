package model;

public class Product {
	String id;
	String title;
	String category;
	double price;

	public Product (String id, String title,String category,double price){
		this.setPrice(price);
		this.setId(id);
		this.setTitle(title);
		this.setCategory(category);
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected void setTitle(String title) {
		this.title = title;
	}	
	
	public  double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public void setCategory(String category){
		this.category = category;
	}
}