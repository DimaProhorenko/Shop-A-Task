package shop.models;

import java.util.Objects;

public class Product {
    public enum Type {
        FOOD,
        DRINK
    }
    private String name;
    private Type type;

    private double price;
    private int quantity;

    public Product(String name) {
        this.name = name;
    }


    public Product(String name, String type, double price, int quantity) {
        this(name, Type.valueOf(type.toUpperCase()), price, quantity);
    }

    public Product(String name, Type type, double price, int quantity) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Type getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int quantity) {
        int newQuantity = this.quantity - quantity;
        this.quantity = newQuantity >= 0 ? newQuantity : 0;
    }

    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void setQuantity(int quantity) {
    }

    @Override
    public String toString() {
        return "%-10s %-10s $%-6.2f %d".formatted(name, type, price, quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equalsIgnoreCase(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
