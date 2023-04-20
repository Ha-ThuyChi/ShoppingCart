/**
 * @author Ha Thuy Chi - s3930417
 */

 package ShoppingCartTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import ShoppingCart.DigitalProduct;
import ShoppingCart.PhysicalProduct;
import ShoppingCart.ShoppingCart;

public class testCalculatePrice {
    @Test
    public void calculatePrice()
    {
        PhysicalProduct product1 = new PhysicalProduct("item1", "des", 10, 10, 2);
        PhysicalProduct product2 = new PhysicalProduct("item2", "des", 10, 10, 4);
        DigitalProduct product3 = new DigitalProduct("item3", "des1", 10, 12.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1.getName());
        cart.addItem(product2.getName());
        cart.addItem(product3.getName());

        assertEquals(6.0, cart.totalWeight());
        assertEquals(32.6, cart.cartAmount());
    }
}
