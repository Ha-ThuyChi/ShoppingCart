/**
 * @author Ha Thuy Chi - s3930417
 */

package ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class testUniqueName {
    @Test
    public void checkUniqueName()
    {
        DigitalProduct product11 = new DigitalProduct("item11", "des1", 100, 12.0);
        PhysicalProduct product12 = new PhysicalProduct("item11", "des1", 100, 12.00, 110);
        assertEquals("DIGITAL - item11, des1, 100, 12.00", product11.toString());
        assertEquals("PHYSICAL - Not Available, des1, 100, 12.00, 110.00", product12.toString());
    }
}
