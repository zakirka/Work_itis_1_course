import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое число K: ");
		int k = scanner.nextInt();
		System.out.println("Введите длину последовательности целых ненулевых чисел: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Введите целые ненулевые числа: ");
		
		for (int i=0;i<n;i++){
			array[i] = scanner.nextInt();
		}
		int maxIndex = 0;
		for (int i=0;i<n;i++){
			if (array[i]>0){
				if (array[i]>k){
					maxIndex = i;
				}
			}
			else{
				break;
			}
		}
		System.out.print("Номер первого числа, большего К: " + maxIndex);
	}
}