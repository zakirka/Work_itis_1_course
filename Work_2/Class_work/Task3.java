import java.util.Scanner;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        System.out.println("Введите ваше число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите номер команды:\n 1 – возвести число в квадрат\n 2 – извлечь корень квадратный\n 3 – вычислить синус\n 4 – косинус ");
        int command_numb = scanner.nextInt();
        if (command_numb == 1) {
            System.out.println(Math.pow((double)x, 2.0));
        }

        if (command_numb == 2) {
            System.out.println(Math.pow((double)x, 0.5));
        }

        if (command_numb == 3) {
            System.out.println(Math.sin((double)x));
        }

        if (command_numb == 4) {
            System.out.println(Math.cos((double)x));
        } else {
            System.out.println("ошибка");
        }

    }
}
