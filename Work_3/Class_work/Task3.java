import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество целых чисел: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		int maxSum = Integer.MIN_VALUE;
		int minSum = Integer.MAX_VALUE;
		int maxIndex = 0;
		int minIndex = 0;
		System.out.println("Введите целые числа: ");
		for (int i=0;i<n;i++){
			array[i] = scanner.nextInt();
		}
		for (int i = 0;i<n-1;i++){
			if (array[i]+array[i+1]>maxSum){
				maxSum = array[i]+array[i+1];
				maxIndex = i;
			}
			if (array[i]+array[i+1]<minSum){
				minSum = array[i]+array[i+1];
				minIndex = i;
			}
		}
		System.out.println("Максимальная сумма двух соседних чисел: " + maxSum);
		System.out.println("Минимальная сумма двух соседних чисел: " + minSum);
		System.out.println("Порядковые номера двух соседних чисел, сумма которых максимальна: [" + maxIndex + " " + (maxIndex+1)+ "]");
		System.out.println("Порядковые номера двух соседних чисел, сумма которых минимальна: [" + minIndex + " " + (minIndex+1)+ "]");
	}
}