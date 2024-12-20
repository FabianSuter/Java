import java.util.Scanner;
public class Einlesen{
public static void main(String[] args) {
    try (var scanner = new Scanner(System.in)) {
        System.out.println("Text eingeben: ");
        String inputText = scanner.next();
        System.out.println("Neuer Text: ");
        String inputText2 = scanner.next();
        String both = inputText + inputText2;
        System.out.println(both);
    }
}
}