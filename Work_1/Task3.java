import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num1 <= num2) {
            num1 = 0;
        }
        else {
            num1 = num1;
        }
        System.out.println(num1);
        System.out.println(num2);

    }
}
