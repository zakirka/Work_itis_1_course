import java.util.Scanner;

public class Task12 {
    public Task12() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания(1,2,3,4): ");
        int choise = scanner.nextInt();
        System.out.println("Введите аргумент функции: ");
        double a = scanner.nextDouble();
        double function = 0.0;
        switch (choise) {
            case 1:
                if (a >= -2.0 && a <= 2.0) {
                    function = a * a;
                } else {
                    function = 4.0;
                }
                break;
            case 2:
                double c = a * a + 5.0 * a + 5.0;
                if (a == 2.0) {
                    function = c;
                } else {
                    function = 1.0 / c;
                }
                break;
            case 3:
                if (a <= 0.0) {
                    function = 0.0;
                }

                if (a > 0.0 && a <= 1.0) {
                    function = a;
                } else {
                    function = Math.pow(a, 4.0);
                }
                break;
            case 4:
                if (a <= 0.0) {
                    function = 0.0;
                }

                if (a > 0.0 && a <= 1.0) {
                    function = a * a - a;
                } else {
                    function = a * a - Math.sin(a * a * Math.PI);
                }
                break;
            default:
                System.out.println("Ошибка!");
                return;
        }

        System.out.println("Функция равна: " + function);
    }
}
