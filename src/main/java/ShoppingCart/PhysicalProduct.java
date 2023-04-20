/**
 * @author Ha Thuy Chi - s3930417
 */

 package ShoppingCart;

public class PhysicalProduct extends Product{
    private String name;
    private String description;
    private int quantity;
    private double price;
    private double weight;
    private String msg;

    public PhysicalProduct(String name, String description, int quantity, double price, double weight) {
        super(name, description, quantity, price);
        this.weight = weight;
        items. put(name, String.format("%s,%d,%.2f, %.2f", description, quantity, price, weight));
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setMessage(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }

    @Override
    public String toString() {
        return String.format("PHYSICAL - %s, %s, %d, %.2f, %.2f", getName(), getDescription(), getQuantity(), getPrice(), getWeight());
    }
}
