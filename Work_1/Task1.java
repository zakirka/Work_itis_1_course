import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        System.out.println("Сумма вашиx чисел:");
        System.out.println(num1 + num2);
    }
}
