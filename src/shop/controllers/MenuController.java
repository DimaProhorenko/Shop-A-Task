package shop.controllers;

import shop.views.MenuView;

public class MenuController {
    public int startMenu() {
        MenuView mv = new MenuView();
        return mv.getMainMenuChoice();
    }
}
