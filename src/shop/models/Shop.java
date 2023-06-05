package shop.models;
import shop.utils.ProductData;

import java.util.*;
public class Shop {
    private List<Product> availableProducts;

    public Shop() {
        availableProducts = generateInitialProducts();
    }

    private List<Product> generateInitialProducts() {
        List<Product> products = new ArrayList<>();
        String[] productData = ProductData.DEFAULT_AVAILABLE_PRODUCTS.split("\n");
        Arrays.asList(productData).forEach(productString -> {
            String[] productArr = Arrays.stream(productString.split(","))
                    .map(String::trim).toArray(String[]::new);
            products.add(new Product(productArr[0],productArr[1],
                    Double.parseDouble(productArr[2]), Integer.parseInt(productArr[3])));
        });
        return products;
    }

    public List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public Product findProduct(String name) {
        int index = availableProducts.indexOf(new Product(name));
        if (index < 0) {
            return null;
        }
        return availableProducts.get(index);
    }

    @Override
    public String toString() {
        return "Available Products: %s".formatted(availableProducts);
    }
}
