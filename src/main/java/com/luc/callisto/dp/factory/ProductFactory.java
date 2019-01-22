package com.luc.callisto.dp.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author : linweizhong
 * @date : 2019-01-22 19:59
 * Description:
 */
public class ProductFactory {


    final static Map<String, Supplier<Product>> map = new HashMap<>();
    static {
        map.put("load", Loan::new);
        map.put("bond", Bond::new);
        map.put("stock", Stock::new);
    }

    public static Product creatProduct(String name) {
        switch (name) {
            case "load" : return new Loan();
            case "bond" : return new Bond();
            case "stock": return new Stock();
            default: throw  new RuntimeException("no such product ..");
        }
    }

    public static Product creatProductWithMap(String name) {
        Supplier<Product> supplier = map.get(name);
        if (supplier != null) {
            return supplier.get();
        }
       throw  new RuntimeException("no such product ..");

    }


    public static void main(String[] args) {
        Product a1 = creatProduct("stock");
        Product a2 = creatProduct("bond");
        Product a3 = creatProduct("load");
        a1.say();
        a2.say();
        a3.say();

        // use lambda
        Product b1 = creatProductWithMap("stock");
        Product b2 = creatProductWithMap("bond");
        Product b3 = creatProductWithMap("load");
        b1.say();
        b2.say();
        b3.say();
    }
}
