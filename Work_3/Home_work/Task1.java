import java.util.Scanner;
import java.util.Arrays;
public class Task1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// A)

		int n = 15;
		double[] array = new double[n];
		System.out.println("Введите элементы массива:");
		for (int i = 0; i<n;i++){
			array[i] = scanner.nextDouble();
		}
		for (int i = 2, j = 8;i<j;i++, j--){
			double jack = array[i];
			array[i] = array[j];
			array[j] = jack;	
		}
		System.out.println("Массив после перестановки элементов между 2-м и 10-м: " + Arrays.toString(array));


		// Б)

		System.out.println("Введите индекс k:");
		int k = scanner.nextInt();
		System.out.println("Введите индекс s:");
		int s = scanner.nextInt();
		for (int i = k, j = s-1;i<j;i++,j--){
			double m = array[i];
			array[i] = array[j];
			array[j] = m;
		}
		System.out.println("Массив после перестановки элементов между k-м и s-m элементами: " + Arrays.toString(array));

		// В)
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		int indexMin = -1;
		int indexMax = -1;
		for (int i = 0;i<n;i++){
			if (array[i]>max){
				max = array[i];
				indexMax = i;
			}
			if (array[i]<min){
				min = array[i];
				indexMin = i;

			}
		}
		for (int i = 0;i<n;i++){
			if (array[i]>array[indexMax]){
				indexMax = i;
			}
			if (array[i]<array[indexMin]){
				indexMin = i;
			}
		}
		if (indexMax>indexMin){
			int tmp = indexMin;
			indexMin = indexMax;
			indexMax = tmp;
		}

		for (int i = indexMin-1,j = indexMax;i<j;i++,j--){
			double lemp = array[i];
			array[i] = array[j];
			array[j] = lemp;
		}
		System.out.println("Массив после перестановки элементов между максимальным и минимальным элементами, включая их: " + Arrays.toString(array));
	}
}