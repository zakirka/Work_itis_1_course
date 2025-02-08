import java.util.Scanner;
public class Task13 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        while (!scanner.hasNextInt()){
            System.out.println("Ошибка:введите корректное число:");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }
        int x;
        x = scanner.nextInt();
        int i = x;
        while(i>=x){
            i =scanner.nextInt();
        }
        System.out.println("Число оказалось меньше");
    }
}



