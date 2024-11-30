import java.util.Scanner;

public class Task4 {
    public Task4() {
    }

    public static void main(String[] args) {
        System.out.println("Введите любую букву от a до f:");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        if (x.equals("a")) {
            System.out.println("A");
        } else if (x.equals("b")) {
            System.out.println("B");
        } else if (x.equals("c")) {
            System.out.println("C");
        } else if (x.equals("d")) {
            System.out.println("D");
        } else if (x.equals("e")) {
            System.out.println("E");
        } else if (x.equals("f")) {
            System.out.println("F");
        } else {
            System.out.println("Ошибка. Введите букву от a до f.");
        }

    }
}
