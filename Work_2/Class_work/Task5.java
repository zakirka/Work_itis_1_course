import java.util.Scanner;

public class Task5 {

    public Task5() {

    }

    public static void main(String[] args) {
        System.out.println("Введите порядковый номер месяца:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x < 13) {
            System.out.println("Количество месяцев, оставшихся до конца года: ");
            System.out.println(12 - x);
        } 

        else {
            System.out.print("Ошибка");
        }
    }
}
