package shop;
import shop.controllers.ShopController;
import shop.models.Shop;

public class Main {
    public static void main(String[] args) {
        ShopController sc = new ShopController();
        sc.startShop();
    }
}
