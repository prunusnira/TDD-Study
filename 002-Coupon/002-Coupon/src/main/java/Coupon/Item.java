package Coupon;

public class Item {
	private String name;
	private String category;
	private int price;

	public Item(String name, String category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}

}
