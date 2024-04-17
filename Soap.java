package Lab04;

public class Soap extends Cleaning {

    private int quantity;

    public Soap(String brand) {
        super(brand);
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double calculateTotalPrice(){
        double totalPrice = 0;
        totalPrice += getQuantity()*(getPrice() + getTaxRate()*getPrice());
        return totalPrice;
    }
}
