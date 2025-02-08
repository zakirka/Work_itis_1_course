import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три действительных числа:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка:введите корректное число");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }
        double x, y, z;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();

        if (x != z && z != y) {
            if ((z + x + y) < 1) {
                if (z < y && z < x) {
                    z = (y + x) / 2;
                    System.out.println("" + x + " " + y + " " + z);
                } else if (y < z && y < x) {
                    y = (z + x) / 2;
                    System.out.println("" + x + " " + y + " " + z);
                } else if (x < y && x < z) {
                    x = (z + y) / 2;
                    System.out.println("" + x + " " + y + " " + z);
                }
            } else {
                if (x < y) {
                    x = (y + z) / 2;
                    System.out.println("" + x + " " + y + " " + z);
                } else {
                    y = (x + z) / 2;
                    System.out.println("" + x + " " + y + " " + z);
                }
            }
        } else {
            System.out.println("Числа не попарно различимы");
        }
    }
}

