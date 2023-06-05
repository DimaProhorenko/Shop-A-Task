package shop.controllers;
import shop.views.ShopView;
import shop.models.Shop;
public class ShopController {
    Shop shop = new Shop();
    ShopView shopView = new ShopView();
    MenuController menuController = new MenuController();

    public void startShop() {
        int menuChoice = -1;
        while(menuChoice != 0) {
            menuChoice = menuController.startMenu();

            switch (menuChoice) {
                case 1:
                    shopView.displayAvailableProducts(shop.getAvailableProducts());
                    break;
                case 2:
                    OrderController oc = new OrderController(shop);
                    oc.handleData();
                    break;
                case 3:
                    FillController fc = new FillController(shop);
                    fc.handleData();
            }
        }
    }
}
