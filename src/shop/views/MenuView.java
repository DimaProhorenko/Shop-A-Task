package shop.views;
import java.util.Scanner;
import shop.utils.Print;
public class MenuView {
    private Scanner scanner = new Scanner(System.in);
    public int getMainMenuChoice() {
        Print.printHeader("Menu");
        int choice = -1;
        while(true) {
            System.out.println("1 - Show available products");
            System.out.println("2 - Make an order");
            System.out.println("3 - Fill products");
            System.out.println("q - quit");
            String choiceString = scanner.nextLine();
            if("qQ".contains(choiceString)) {
                System.out.println("Bye");
                choice = 0;
                break;
            } else if("123".contains(choiceString)) {
                choice = Integer.parseInt(choiceString);
                break;
            }
        }
        return choice;
    }
}
