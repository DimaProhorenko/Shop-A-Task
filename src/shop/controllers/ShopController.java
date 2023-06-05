package shop.controllers;
import shop.views.ShopView;
import shop.models.Shop;
public class ShopController {
    Shop shop = new Shop();
    ShopView shopView = new ShopView();

    public void startShop() {

        shopView.displayAvailableProducts(shop.getAvailableProducts());
        int menuChoice = displayMainMenu();

        switch(menuChoice) {
            case 1: {
                OrderController oc = new OrderController(shop);
                oc.handleData();
            }
            break;

        }

        shopView.displayAvailableProducts(shop.getAvailableProducts());
    }

    public int displayMainMenu() {
       return shopView.getMenuChoice();
    }

    private void makeOrder() {

    }
}
