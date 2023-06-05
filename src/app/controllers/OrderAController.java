package app.controllers;


import app.models.OrderA;
import app.utils.Rounder;
import app.views.OrderAView;

public class OrderAController {

    public void handleData() {

        OrderAView view = new OrderAView();
        String[] data = view.getData();

        OrderA product = new OrderA(data[0]);

        String cost = Rounder.roundValue(
                product.getOrderCost(Integer.parseInt(data[1]),
                Double.parseDouble(data[2]))
        );

        String output = "\nOrder " + data[0] + " is USD " + cost;

        view.getOutput(output);
    }
}
