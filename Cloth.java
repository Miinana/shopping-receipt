package Lab04;

public class Cloth extends Product {
	private String brand;
	private String color;
	private int quantity;

	public Cloth(double taxRate, String color, String brand){
		super(taxRate);
		this.color = color;
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calculateTotalPrice(){
		double totalPrice = 0;
			totalPrice += getQuantity()*(getPrice() + (getTaxRate()/100)*getPrice());
		return totalPrice;
	}

	public String toString(){
		return super.toString() +
				"Brand: " + brand + "\n" +
				"Color: " + color + "\n" +
				"Quantity: " + quantity + "\n";
	}
}
