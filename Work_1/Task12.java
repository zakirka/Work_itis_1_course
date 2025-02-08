import java.util.Scanner;
public class Task12 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное целое число:");
        while (!scanner.hasNextInt()){
            System.out.println("Ошибка:введите корректное число");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }
        int x;
        x = scanner.nextInt();

        if (x>=0){
            System.out.println(Integer.toBinaryString(x));
        }else {
            System.out.println("Число не подходит");
        }
    }
}
