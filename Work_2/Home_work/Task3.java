import java.util.Scanner;
import java.lang.Math;
public class Task3{
	public Task3(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число");
		int m = scanner.nextInt();
		System.out.println("Введите второе число");
		int n = scanner.nextInt();
		double PI = 3.141592653589793;
		if (m==n){
			System.out.println("Ошибка: введите другие числа");
			return;
		}
		int M1 = (m/n)*10;
		int N1 = (n/m)*2;
		if (Math.abs(M1 - PI)<Math.abs(N1-PI)){
			System.out.println("m/n ближе к числу Pi");
		}
		else {
			System.out.println("n/m ближе к числу Pi");
		}


	}
}