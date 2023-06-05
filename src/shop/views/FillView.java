package shop.views;
import java.util.*;
import shop.utils.Print;
public class FillView {
    private Scanner scanner = new Scanner(System.in);
    public String[] getFillValues() {
        Print.printHeader("Fill products");
        System.out.println("Enter products name and amount separated by commas to fill them(tomato 10, beer 20)");
        String value = scanner.nextLine();
        return Arrays.stream(value.split(",")).map(String::trim).toArray(String[]::new);
    }
}
