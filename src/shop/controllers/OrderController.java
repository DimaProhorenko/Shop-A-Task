package shop.controllers;
import shop.views.OrderView;
import shop.models.*;

import java.util.*;

public class OrderController {
    private Shop shop;

    public OrderController(Shop shop) {
        this.shop = shop;
    }

    public void handleData() {
        OrderView ov = new OrderView();
        String[] orderData = ov.getData();
        Order order = new Order();
        for (String orderLine : orderData) {
            if(!addProduct(orderLine, order)) {
                ov.printNotEnoughProductMessage(orderLine.split(" ")[0]);
            }
        }
        ov.printReceipt(order.getProducts(), order.getTotalPrice());
    }

    private boolean addProduct(String productData, Order order) {
        String[] productInfo = productData.split(" ");
        Product shopProduct = shop.findProduct(productInfo[0]);
        int orderQuantity = Integer.parseInt(productInfo[1]);
        System.out.println("KOL: " + orderQuantity);
        if (shopProduct != null && checkIfEnough(shopProduct.getQuantity(), orderQuantity)) {
            Product p = makeProduct(shopProduct, orderQuantity);
            deductAvailableProducts(shopProduct, orderQuantity);
            order.addProduct(p);
            return true;
        }
        return false;
    }

    private Product makeProduct(Product p, int quantity) {
        return new Product(p.getName(), p.getType(), p.getPrice(), quantity);
    }

    private void deductAvailableProducts(Product p, int quantity) {
        p.reduceQuantity(quantity);
    }

    private boolean checkIfEnough(int quantity, int askedQuantity) {
        return quantity >= askedQuantity;
    }
}
