import java.util.Scanner;
public class Task1{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество натуральных чисел: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Введите натуральные числа: ");
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i<n; i++){
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i<n;i++){
			if (array[i]>=maxIndex){
				maxIndex = i;
			}
			if (array[i]<=minIndex){
				minIndex = i;
			}
		}
		System.out.println("Индекс последнего максимального элемента: " + maxIndex);
		System.out.println("Индекс первого минимального элемента: " + minIndex);
		
	}
}