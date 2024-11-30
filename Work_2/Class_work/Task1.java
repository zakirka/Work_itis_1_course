import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите вашу оценку:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k == 1) {
            System.out.print("плохо");
        }   

        else if (k == 2) {
            System.out.print("неудовлетворительно");
        }

        else if (k == 3) {
            System.out.print("удовлетворительно");
        }

        else if (k == 4) {
            System.out.print("хорошо");
        }

        else if (k == 5) {
            System.out.print("отлично");
        } 
        else {
            System.out.print("ошибка");
        }
    }
}
