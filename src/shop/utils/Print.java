package shop.utils;

public abstract class Print {
    public static void printHeader(String header) {
        String separator = "-".repeat(90);
        System.out.println(separator);
        System.out.println(header);
        System.out.println(separator);
    }
}
