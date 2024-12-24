import java.util.Scanner;
import java.lang.Math;

public class Task1{
	public Task1(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число от 2 до 9:");
		int k = scanner.nextInt(); // степень счисления
		if (!(k>2 && k<9)){
			System.out.println("Ошибка:\nВведите число от 2 до 9:");
			
			int a = scanner.nextInt();
			if (!(a>2 && a<9)){	
				System.out.println("Опять ошибка");
			}
			else {
				k = a;
			}
		}
	
		int n = scanner.nextInt(); // исходное число в k-ой системе счисления

		int number10 = 0;
		for (int i=0; n!=0; i++){
			if (n%10<k){
				number10 += (n%10)*Math.pow(k,i);
				n = n/10;
			}
			else {
				System.out.println("Ошибка: присутствует цифра в числе, не соответсвтующая данной системе счисления");
				return;
			}
		}
		System.out.println("Ответ: " + number10);

	}
}
