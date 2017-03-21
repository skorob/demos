package lv.oskor.threads.forkjoin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Skorobogatov on 27.06.2016.
 */
public class ProductListGenerator {

    public List<Product> generate (int size) {
        List<Product> ret=new ArrayList<Product>();
        for (int i=0; i<size; i++){
            Product product=new Product();
            product.setName("Product "+i);
            product.setPrice(10);
            ret.add(product);
        }
        return ret;
    }

}
