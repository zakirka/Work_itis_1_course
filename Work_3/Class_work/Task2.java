import java.util.Scanner;
public class Task2{
	public Task2(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество пар чисел:");
		int n = scanner.nextInt();
		int minProduct = Integer.MAX_VALUE;
		int maxSum = Integer.MIN_VALUE;
		System.out.println("Введите пары чисел а и б: ");
		for (int i = 0; i<n; i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int sum = a+b;
			int product = a*b;
			if (sum>maxSum){
				maxSum = sum;
			}
			if (product<minProduct){
				minProduct = product;
			}
		} 
		System.out.println("Максимальная сумма значений чисел в паре: " + maxSum);
		System.out.println("Минимальное произведение значений чисел в паре: " + minProduct);

	}
}







