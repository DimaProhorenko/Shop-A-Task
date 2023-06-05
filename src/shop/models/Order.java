package shop.models;
import java.util.*;

public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order() {
        this.products = new ArrayList<>();
        totalPrice = 0;
    }

    public Order(List<Product> products) {
        this.products = products;
        this.totalPrice = calculateTotalPrice();
    }

    public void addProduct(Product p) {
        products.add(p);
        totalPrice += p.getPrice() * p.getQuantity();
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private double calculateTotalPrice() {
        return products.stream().mapToDouble(product -> product.getPrice() * product.getQuantity()).sum();
    }
}
