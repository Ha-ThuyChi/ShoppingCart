/**
 * @author Ha Thuy Chi - s3930417
 */

 package ShoppingCartTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import ShoppingCart.DigitalProduct;
import ShoppingCart.PhysicalProduct;
import ShoppingCart.ShoppingCart;
import ShoppingCart.ShoppingCartComparator;

public class testSortCarts {
    @Test
    public void sortCartAscending() {
        PhysicalProduct product6 = new PhysicalProduct("item6", "des", 10, 10, 2);
        PhysicalProduct product7 = new PhysicalProduct("item7", "des", 10, 10, 3);
        PhysicalProduct product8 = new PhysicalProduct("item8", "des", 10, 10, 2);
        PhysicalProduct product9 = new PhysicalProduct("item9", "des", 10, 10, 8);
        DigitalProduct product10 = new DigitalProduct("item10", "des", 10, 15);

        ShoppingCart cart1 = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();
        ShoppingCart cart3 = new ShoppingCart();
        ShoppingCart cart4 = new ShoppingCart();
        
        cart1.addItem(product6.getName());
        cart1.addItem(product7.getName());
        cart2.addItem(product8.getName());
        cart2.addItem(product9.getName());
        cart3.addItem(product9.getName());
        cart4.addItem(product10.getName());

        List<ShoppingCart> lst = new ArrayList<>();
        lst.add(cart1);
        lst.add(cart4);
        lst.add(cart2);
        lst.add(cart3);
        lst.sort(new ShoppingCartComparator());
        
        assertEquals(4, lst.size());
        assertEquals(5, cart1.totalWeight());
        assertTrue(lst.get(0) == cart4);
        assertTrue(lst.get(1) == cart1);
        assertTrue(lst.get(2) == cart3);
        assertTrue(lst.get(3) == cart2);

    }
}
