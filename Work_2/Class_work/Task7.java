import java.util.Scanner;

public class Task7 {
    public Task7() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double z = scanner.nextDouble();
        double x = (double)(a % b);
        if (x == 0.0) {
            System.out.println(z * x);
        } else {
            System.out.println(z / x);
        }

    }
}
