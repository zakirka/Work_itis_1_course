import java.util.Scanner;

public class Task10{
    public Task10() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов : ");
        int n = scanner.nextInt();
        double[] sequence = new double[n];
        System.out.println("Введите " + n + " элементов последовательности: ");

        for(int i = 0; i < n; ++i) {
            sequence[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i < n; ++i) {
            if (sequence[i] > 0.0) {
                sum += sequence[i];
            }
        }

        System.out.println("Удвоенная сумма положительных элементов равна: " + 2.0 * sum);
    }
}
