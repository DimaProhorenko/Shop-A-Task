package shop.views;
import java.util.*;
import shop.utils.Print;
import shop.models.Product;
public class ShopView {
    Scanner scanner = new Scanner(System.in);
    public void displayAvailableProducts(List<Product> products) {
        Print.printHeader("Available Products");
        products.forEach(System.out::println);
    }

    public int getMenuChoice() {
        int choice = -1;
        boolean flag = true;
        while (true) {
            System.out.println("1 - Make an order");
            System.out.println("q - to quit");
            String choiceString = scanner.nextLine();
            if("qQ".contains(choiceString)) {
                System.out.println("Thanks for visiting");
                break;
            }
            try {
                choice = Integer.parseInt(choiceString);
                if(choice == 1) {
                    System.out.println("Make order");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input " + choiceString);
            }
        }

        return choice;
    }
}
