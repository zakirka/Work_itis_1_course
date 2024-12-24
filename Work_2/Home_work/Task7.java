import java.util.Scanner;
import java.lang.Math;
public class Task7{
	public Task7(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double length = (Math.log10(Math.abs(n))+1);
		System.out.println("Количество цифр в числе " + n + ": " + length);
		int sum = 0;
		for (int i = 0; i < length; i++){
			sum+=n%10;
			n/=10;
		}
		System.out.println("Cумма цифр числа " + n + sum);
		double first_number = ((n/Math.pow(10,length))%10);
		System.out.println("Первая цифра числа " + n + "равна: " + first_number);

	}
}