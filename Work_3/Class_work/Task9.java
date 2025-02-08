import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Введите элементы массива: ");
		for (int i = 0;i<n;i++){
			array[i] = scanner.nextInt();
		}
		for (int i = 0;i<n-1;i++){
			for (int j = n-1;j>i;j--){
				if (array[j-1]>array[j]){
					int tmp = array[j-1];
					array[j-1] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println("Конечный массив:");
		for (int arr:array){
			System.out.println(arr);
		}
		System.out.println("Последний элемент массива: " + array[n-1]);
	}
}