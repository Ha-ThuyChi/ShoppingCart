/**
 * @author Ha Thuy Chi - s3930417
 */
package assignment1;

import java.util.HashMap;
import java.util.Map;


public abstract class Product 
{
    private String name;
    private String description;
    private int quantity;
    private double price;
    protected static Map<String, String> items = new HashMap<>();

    public Product() {

    }
    public Product(String name, String desciption, int quantity, double price) {
        if (items.containsKey(name)) {
            this.name = "Not Available";
        } else {
            this.name = name;
            items.put(name, " ");
        }
        this.description = desciption;
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        this.price = price;
        items.put(name, " ");
    }

    public void setName(String name) {
        if (items.containsKey(name)) {
            this. name = "Not Available";
        } else {
            this.name = name;
            items.put(name, " ");
        }

    }
    public String getName() {
        return this.name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity) {
        if (quantity >=0) {
            this.quantity = quantity;
        } else {
            quantity = 0;
        }
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public abstract String toString();

}
