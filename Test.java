package Lab04;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {


		Cloth skirt = new Cloth(20, "red", "M&S");
		skirt.setQuantity(5);
		skirt.setPrice(40);
		skirt.setName("skirt");
		System.out.println(skirt);
		System.out.println( "TotalPrice" + skirt.calculateTotalPrice());

		Trousers jean = new Trousers(30, "blue", "B");
		jean.setPrice(50.99);
		jean.setName("skinny jean");
		jean.setQuantity(10);
		System.out.println(jean);
		System.out.println( "TotalPrice" +jean.calculateTotalPrice());

		Dairy milk = new Dairy(25, 1, true, "milk");
		milk.setExpirationDate("09.11.2018");
		milk.setPrice(2.95);
		System.out.println(milk);
		System.out.println( "TotalPrice" + milk.calculateTotalPrice());

		Food pepper = new Food("pepper");
		pepper.setKgs(10);
		pepper.setTaxRate(18);
		pepper.setPrice(1);
		System.out.println(pepper);
		System.out.println( "TotalPrice" + pepper.calculateTotalPrice() );

		DishWashing tablet = new DishWashing("C");
		tablet.setLts(30);
		tablet.setLiquid(false);
		tablet.setPrice(25);
		tablet.setTaxRate(18);
		tablet.setName("tablet");
		System.out.println(tablet);
		System.out.println( "TotalPrice" + tablet.calculateTotalPrice());

		double totalPrice = skirt.calculateTotalPrice() + jean.calculateTotalPrice() +
				milk.calculateTotalPrice() + pepper.calculateTotalPrice() + tablet.calculateTotalPrice();
		System.out.println("Total Price of all products: " + Math.round(totalPrice * 100.0) / 100.0);
	}
}

