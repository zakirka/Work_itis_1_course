
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if (num1 >= 0) {
            num1 = Math.pow(num1, 2);
        }
        if (num2 >= 0) {
            num2 = Math.pow(num2, 2);
        }
        if (num3 >= 0) {
            num3 = Math.pow(num3, 2);
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
