package Lab04;

public class Cleaning extends Product {
	private String brand;

	public Cleaning(String brand){
		this.brand = brand;
	}
	public Cleaning(String name, double taxRate, double price){
		super(name, taxRate, price);
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		 return brand;
	}

	public double calculateTotalPrice(){
		double totalPrice = 0;
		totalPrice += (getPrice() + (getTaxRate()/100)*getPrice());
		return totalPrice;
	}


	public String toString(){
		return super.toString() +
				"Brand: " + brand + "\n";
	}
}
