/**
 * @author Ha Thuy Chi - s3930417
 */

package ShoppingCart;

import java.util.Comparator;

public class ShoppingCartComparator implements Comparator<ShoppingCart> {
    
    @Override
    public int compare(ShoppingCart cart1, ShoppingCart cart2) {
        return cart1.totalWeight().compareTo(cart2.totalWeight());
    }
}
