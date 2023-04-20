/**
 * @author Ha Thuy Chi - s3930417
 */

 package ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class testSetGetMsg {
    @Test
    public void setGetMessage()
    {
        PhysicalProduct product1 = new PhysicalProduct("item1", "des1", 100, 12.0, 23.0);
        product1.setMessage("gift");
        assertEquals("gift", product1.getMessage());
    }
}
