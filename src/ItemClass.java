import java.util.ArrayList;
public class ItemClass {
	private String itemName;
	private double price;
	
	public ItemClass(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}

	public String getName() {
		return itemName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static double getCartPrice(ArrayList<ItemClass> cartList) {
		double totalPrice = 0;
		for(int i=0; i<cartList.size(); i++) {
			totalPrice += cartList.get(i).getPrice();
		}
		return totalPrice;
	}
	
	public String toString() {
		return itemName + " " + price;
	}
	 
}
