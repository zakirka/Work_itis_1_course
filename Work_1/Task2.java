import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();
        if (num1 == num2) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
