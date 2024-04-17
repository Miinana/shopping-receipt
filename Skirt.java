package Lab04;

public class Skirt extends Cloth {
	public Skirt(int quantity, String brand, String color, double taxRate, String name){
		super(taxRate, color, brand);
		setName(name);
		setQuantity(quantity);
	}
  
	// We don't need to overwrite the toString() method since 
	// there is no additional information to print out.
}
