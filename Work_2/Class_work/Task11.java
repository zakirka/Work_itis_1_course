import java.util.Scanner;

public class Task11 {
    public Task11() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности: ");
        int n = scanner.nextInt();
        double[] sequence = new double[n];
        System.out.println("Введите " + n + " элементов последовательности: ");
        double answer = 1.0;

        int i;
        for(i = 0; i < n; ++i) {
            sequence[i] = scanner.nextDouble();
        }

        for(i = 0; i < n; ++i) {
            if (sequence[i] % 7.0 == 0.0) {
                answer *= sequence[i];
            }
        }

        System.out.println("Произведение элементов последовательности, кратных 7 равно: " + answer);
    }
}
