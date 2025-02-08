
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int sum = 0;
        while (num1 != 0) {
            sum += (num1 % 10);
            num1 = (num1 / 10);
        }
        System.out.println(sum);
    }
}
