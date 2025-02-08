import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину последовательности целых чисел: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Введите целые числа: ");
		for (int i = 0; i<n;i++){
			array[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i=0;i<n;i++){
			if (array[i]>0){
				if (array[i]%2==0){
					sum+=array[i];
				}
			}
			else {
				break;
			}
		}
		System.out.println("сумму всех положительных четных чисел из данного набора: " + sum);

	}
}