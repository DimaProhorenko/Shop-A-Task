package app.models;

public class OrderA extends Order{

    public OrderA(String code) {
        super(code);
    }

    public double getOrderCost(int quota, double price) {
        return quota * price;
    }
}
