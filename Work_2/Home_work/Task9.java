import java.util.Scanner;
import java.lang.Math;
public class Task9{
	public Task9(){
	}
	public static void main(String[] args){
		System.out.println("Введите число: ");
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println("Введите номер функции(1,2,3): ");
		int n = scanner.nextInt();
		double f = 0;
		if (n == 1){
			double t = Math.pow(x,2)+4*x+5;
			if (x<=2){
				f = t;
			}
			else {
				f = 1/t;
			}
		}
		if (n==2){
			if (x<=0){
				f = 0;
			}
			else if (x>0 && x<=1){
				f = x;
			}
			else {
				f = Math.pow(x,4);
			}
		}
		if (n==3){
			if (x<=0){
				f = 0;
			}
			else if (x>0 && x<=1){
				f = Math.pow(x,2)-x;
			}
			else {
				f = Math.pow(x,2)-Math.sin(Math.PI*Math.pow(x,2));		}
		}
		System.out.println("Ответ: " + f);
	}
}