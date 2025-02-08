import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите 4 числа: ");
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("................");


        if (a <= b && b <= c && c <= d) {

            int max = Math.max(Math.max(a, b), Math.max(c, d));
            System.out.println(max);
            System.out.println(max);
            System.out.println(max);
            System.out.println(max);
        } else if (a > b && b > c && c > d) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else {
            System.out.println(Math.pow(a, 2));
            System.out.println(Math.pow(b, 2));
            System.out.println(Math.pow(c, 2));
            System.out.println(Math.pow(d, 2));
        }
    }
}
