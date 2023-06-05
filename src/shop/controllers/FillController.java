package shop.controllers;

import shop.models.Product;
import shop.views.FillView;
import shop.models.Shop;

public class FillController {
    private Shop shop;

    public FillController(Shop shop) {
        this.shop = shop;
    }

    public void handleData() {
        FillView fv = new FillView();
        String[] fillValues = fv.getFillValues();
        for(String fillData : fillValues) {
            String[] fillDataArr = fillData.split(" ");
            Product p = shop.findProduct(fillDataArr[0]);
            if(p != null) {
                p.increaseQuantity(Integer.parseInt(fillDataArr[1]));
            }
        }
    }
}
