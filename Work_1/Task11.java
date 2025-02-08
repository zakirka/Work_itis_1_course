import java.util.Scanner;
public class Task11 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три действительных числа:");
        while (!scanner.hasNextDouble()){
            System.out.println("Ошибка:введите корректное число");
            scanner.next();
            System.out.print("Попробуйте снова: ");
        }
        double a,b,c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if (a!= 0){
            double D = (b*b)-(4*a*c);
            if (D>0){
                double D2 = Math.sqrt(D);
                double x1 = (-b +D2)/2*a;
                double x2 = (-b -D2)/2*a;
            }else{
                System.out.println("Действительных корней нет");
            }
        }else{
            System.out.println("A равен нулю");
        }
    }
}
