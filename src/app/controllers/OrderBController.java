package app.controllers;


import app.models.OrderB;
import app.utils.Rounder;
import app.views.OrderBView;

public class OrderBController {

    public void handleData() {

        OrderBView view = new OrderBView();

        String[] data = view.getData();

        OrderB product = new OrderB(data[0],
                Double.parseDouble(data[3]));

        String cost = Rounder.roundValue(
                product.getOrderCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2])));

        String delivery = Rounder.roundValue(
                Double.parseDouble(data[3]));

        String output = "\nOrder " + data[0] + " is USD " +
                cost + "\nDelivery is USD " + delivery;

        view.getOutput(output);
    }
}
