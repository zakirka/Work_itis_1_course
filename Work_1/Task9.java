import java.util.Scanner;
public class Task9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три действительных положительных числа:");
        while (!scanner.hasNextDouble()){
            System.out.println("Ошибка:введите корректное число");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }
        double x,y,z;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        double max_numb_prom = Math.max(x,y);
        double max_numb = Math.max(z,max_numb_prom);
        double min_numb_prom = Math.min(x,y);
        double min_numb = Math.min(min_numb_prom,z);
        double mid_numb = max_numb - min_numb;
        if ((x+y)>z){
            System.out.println("Существует");
            if ((max_numb*max_numb)< ((mid_numb*mid_numb)+(min_numb*min_numb))){
                System.out.println("Остроугольный");
            } else{
                System.out.println("Другой");
            }
        } else{
            System.out.println("Не существует");
        }
    }
}
