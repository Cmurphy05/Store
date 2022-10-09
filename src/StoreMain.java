import java.util.ArrayList;
import java.util.Scanner;
public class StoreMain {

		private static ArrayList<ItemClass> itemInStock = new ArrayList();
		
		private static ItemClass steak = new ItemClass("Steak", 12.00);
		private static ItemClass carrot = new ItemClass("Carrot", 2.00);
		private static ItemClass cake = new ItemClass("Cake", 25.00);
		private static ItemClass corn = new ItemClass("Corn", 3.00);
		private static ItemClass tortilla = new ItemClass("Tortilla", 0.5);
		private static ItemClass groundBeef = new ItemClass("Ground Beef", 5.00);
		private static ItemClass milk = new ItemClass("Milk", 7.50);
		private static ItemClass ramen = new ItemClass("Ramen", 3.50);
		private static ItemClass cheese = new ItemClass("Cheese", 2.75);
		private static ItemClass bread = new ItemClass("Bread", 7.25);
		
		private static ArrayList<ItemClass> cartList = new ArrayList();
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		itemInStock.add(steak);
		itemInStock.add(carrot);
		itemInStock.add(cake);
		itemInStock.add(corn);
		itemInStock.add(tortilla);
		itemInStock.add(groundBeef);
		itemInStock.add(milk);
		itemInStock.add(ramen);
		itemInStock.add(cheese);
		itemInStock.add(bread);
		
		
		
		String input = "";
		
		while(!input.equals("stop")) {
			System.out.println("What do you want to do?");
		
			input = scanner.nextLine();
			
			//checks cart price
			if(input.equals("check cart price")) {
				System.out.println(ItemClass.getCartPrice(cartList));
			}
			
			//adds items to cart
			if(input.equals("add to cart")) {
				System.out.println("What do you want to add?");
				
				String itemAdd = scanner.nextLine();
				
				for(int i = 0; i<itemInStock.size(); i++) {
					String item = itemInStock.get(i).getName();
					if(item.equalsIgnoreCase(itemAdd)) {
						cartList.add(itemInStock.get(i));
						System.out.println("Item added to cart");
						break;
					}
					else if(i==itemInStock.size()-1) {
						System.out.println("Item is not in stock");
					}
				}	
			}
			
			//checks all items within cart
			if(input.equals("check cart")) {
				if(cartList.size()!=0) {
					System.out.println(cartList.toString());
				}
				else {
					System.out.println("Cart is empty");
				}
			}
			
			//removes items from cart
			if(input.equals("remove from cart")) {
				System.out.println("What do you want to remove?");
				
				String itemRemove = scanner.nextLine();
				
				for(int i = 0; i<cartList.size(); i++) {
					String item = cartList.get(i).getName();
					if(item.equalsIgnoreCase(itemRemove)) {
						cartList.remove(cartList.get(i));
						System.out.println("Item removed from cart");
						break;
					}
					else if(i==cartList.size()-1) {
						System.out.println("Item was not in cart");
					}
				}
				
			}
			
			//checks price of specific items
			if(input.equals("check item price")) {
				System.out.println("What item?");
				
				String item1 = scanner.nextLine();
				
				for(int i = 0; i<itemInStock.size(); i++) {
					String item = itemInStock.get(i).getName();
					if(item.equalsIgnoreCase(item1)) {
						System.out.println(item + " costs $" + itemInStock.get(i).getPrice());
						break;
					}
				}
			}
			
		}

	}

}
