import java.util.Scanner;

public class Task6 {
    public Task6() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int n = scanner.nextInt();

        for(int i = 0; i != m; ++i) {
            for(int j = 0; j != n; ++j) {
                System.out.print("1 ");
            }

            System.out.println(" ");
        }

    }
}
