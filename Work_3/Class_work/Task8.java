import java.util.Scanner;
public class Task8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Введите элементы массива: ");
		for (int i = 0; i<n; i++){
			array[i] = scanner.nextInt();
		}
		int max1 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		int minIndex1 = -1;
		int minIndex2 = -1;

		for (int i = 0;i<n;i++){
			if (array[i]>max1){
				max2 = max1;
				max1 = array[i];
			} else if (array[i]>max2 && array[i]!=max1){
				max2 = array[i];
			}
			if (array[i]<min1){
				min2 = min1;
				min1 = array[i];
				minIndex1 = i;
			} else if (array[i]<min2 && array[i]!=min1){
				min2 = array[i];
				minIndex2 = i;
			}
		}
		System.out.println("Максимальный элемент массива и элемент, являющийся максимальным без учета этого элемента: " + max1 + " " + max2);
		System.out.println("Минимальный элемент массива и элемент, являющийся минимальным без учета этого элемента: " + min1 + " " +min2);
		System.out.println("Индексы минимального элемента массива и элемента, являющегося минимальным без учета этого элемента: " + minIndex1 + " " + minIndex2);
	}
}