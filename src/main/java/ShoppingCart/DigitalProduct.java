/**
 * @author Ha Thuy Chi - s3930417
 */

package ShoppingCart;

public class DigitalProduct extends Product {
    private String name;
    private String description;
    private int quantity;
    private double price;
    private String msg;

    public DigitalProduct(String name, String description, int quantity, double price) {
        super(name, description, quantity, price);
        items. put(name, String.format("%s,%d,%.2f", description, quantity, price));
    }
    
    public void setMessage(String msg) {
        this.msg = msg;
    }
    public String getMessage() {
        return msg;
    }

    @Override
    public String toString() {
        return String.format("DIGITAL - %s, %s, %d, %.2f", getName(), getDescription(), getQuantity(), getPrice());
    }
}
