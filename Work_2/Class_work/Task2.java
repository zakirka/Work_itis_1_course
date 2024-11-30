import java.util.Scanner;

public class Task2{
    public Task2() {
    }

    public static void main(String[] args) {
        System.out.println("Введите время в часах:");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t >= 0 && t <= 24) {
            if (t >= 0 && t < 6) {
                System.out.print("Доброй ночи");
            }

            if (t >= 6 && t < 12) {
                System.out.print("Доброе утро");
            }

            if (t >= 12 && t < 18) {
                System.out.print("Добрый день");
            }

            if (t >= 18 && t < 24) {
                System.out.print("Добрый вечер");
            }
        } else {
            System.out.print("Ошибка");
        }

    }
}
