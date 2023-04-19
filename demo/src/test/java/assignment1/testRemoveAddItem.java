/**
 * @author Ha Thuy Chi - s3930417
 */

 package assignment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class testRemoveAddItem {
    @Test
    public void removeAndAddItem()
    {
        PhysicalProduct product4 = new PhysicalProduct("item4", "des", 10, 10, 2);
        DigitalProduct product5 = new DigitalProduct("item5", "des1", 0, 12.0);

        ShoppingCart cart = new ShoppingCart();

        assertEquals(true, cart.addItem(product4.getName()));
        assertEquals(false, cart.addItem(product5.getName()));
        assertEquals(true, cart.removeItem(product4.getName()));
        assertEquals(false, cart.removeItem(product5.getName()));
    }
}
