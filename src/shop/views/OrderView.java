package shop.views;
import java.util.*;
import shop.models.Product;
import shop.utils.Print;
public class OrderView {
    private Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        System.out.println("Enter products name and quantity, separated by comma(tomato 2, beer 3)");
        String choice = scanner.nextLine();
        return Arrays.stream(choice.split(",")).map(String::trim).toArray(String[]::new);

    }

    public void printNotEnoughProductMessage(String name) {
        System.err.println("We don't have enough " + name);
    }

    public void printReceipt(List<Product> list, double total) {
        Print.printHeader("Your receipt");
        list.forEach(System.out::println);
        System.out.println("Total: $%.2f".formatted(total));
    }
}
