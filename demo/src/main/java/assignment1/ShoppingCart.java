/**
 * @author Ha Thuy Chi - s3930417
 */

 package assignment1;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart extends Product{
    Set<String> itemsCart;

    public ShoppingCart() {
        itemsCart = new HashSet<>();
    }
    
    public boolean addItem(String productName) {
        String newValue = "";
        if (productName.contains(productName)) {
            String[] values = items.get(productName).split(",");
            if (values[1].equals("0")) {
                return false;
            } else if (itemsCart.contains(productName)) {
                return false;
            } else {
                String newQuantity = String.format("%d", Integer.parseInt(values[1]) - 1);
                values[1] = newQuantity;
                for (String i : values) {
                    newValue += String.format("%s,", i);
                }
                itemsCart.add(productName);
                items.put(productName, newValue);
                return true;
            }
        } else {
            return false;
        }
    }
 
    public boolean removeItem(String productName) {
        String newValue = "";
        if (itemsCart.contains(productName)) {
            String[] values = items.get(productName).split(",");
            String newQuantity = String.format("%d", Integer.parseInt(values[1]) + 1);
            values[1] = newQuantity;
            for (String i : values) {
                newValue += String.format("%s,", i);
            }
            items.put(productName, newValue);
            itemsCart.remove(productName);
            return true;
        } else {
            return false;
        }
    }

    public Double totalWeight() {
        Double totalWeight = 0.0;
        for (String i : itemsCart) {
            String[] values = items.get(i).split(",");
            if (values.length == 4) {
                totalWeight += Double.parseDouble(values[3]);
            } else {
                totalWeight += 0;
            }
        }
        return totalWeight;
    }
    public double cartAmount() {
        double totalPrice = 0;
        double totalWeight = totalWeight() * 0.1;
        
        for (String i : itemsCart) {
            String[] values = items.get(i).split(",");
            totalPrice += Double.parseDouble(values[2]);
        }
        return totalPrice += totalWeight;
    }
    @Override
    public String toString() {
        String result = "";
        for (String i : itemsCart) {
            result += String.format("%s", i);
        }
        return result;
    }
}
