package sda.code.intermediate.part1.exercises.patterns;

import sda.code.intermediate.part1.exercises.data.Product;

/**
 * Fabryka produktów powinna korzystać z wcześniej utworzonych klas typu
 * builder.
 */
public class ProductFactory {

    public static final String TEST_PRODUCT_NAME = "Test product";
    public static final String TEST_PRODUCT_PRICE = "0.01";

    public static ItemBuilder newItem() {
        return new ItemBuilder();
    }

    public static ServiceBuilder newService() {
        return new ServiceBuilder();
    }

    public static Product testProduct() {
        return newItem().withName(TEST_PRODUCT_NAME).withPrice(TEST_PRODUCT_PRICE).withWeight(10.0).build();
     //   return newService().withName(TEST_PRODUCT_NAME).withPrice(TEST_PRODUCT_PRICE).withTime(10).build();

    }

}
