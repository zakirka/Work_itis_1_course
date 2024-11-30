import java.util.Scanner;

public class Task13 {
    public Task13() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное и натуральное числа");
        double a = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println("Выберите действие: \n1\n2\n3");
        int move = scanner.nextInt();
        switch (move) {
            case 1:
                System.out.println(Math.pow(a, (double)n));
                break;
            case 2:
                double mult = 1.0;

                for(int i = 0; i < n; ++i) {
                    mult *= a + (double)i;
                }

                System.out.println("Результат: " + mult);
                break;
            case 3:
                double sum = 0.0;

                for(int i = 0; i <= n; ++i) {
                    double denominator = 1.0;

                    for(int j = 0; j <= i; ++j) {
                        denominator *= a + (double)j;
                    }

                    sum += 1.0 / denominator;
                }

                System.out.println("Результат: " + sum);
                break;
            default:
                System.out.println("Такого режима не существует");
        }

    }
}
