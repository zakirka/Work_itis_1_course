import java.util.Scanner;
import java.util.Arrays;
public class Task10{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива:");
		int len = scanner.nextInt();
		int[] array = new int[len];
		System.out.println("Введите элементы массива:");
		for (int i = 0; i<len;i++){
			array[i] = scanner.nextInt();
		}
		System.out.println("Введите индекс m-элемента: ");
		int m = scanner.nextInt();
		System.out.println("Введите индекс n-элемента: ");
		int n = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int temp = array[1];
		array[1] = array[4];
		array[4] = temp;
		System.out.println("После замены а):");
        System.out.println(Arrays.toString(array));

		temp = array[m-1];
		array[m-1] = array[n-1];
		array[n-1] = temp;
		System.out.println("После замены б):");
        System.out.println(Arrays.toString(array));

        int maxIndex = 0;

		for (int i = 1; i<len;i++){
			if (array[i]>array[maxIndex]){
				maxIndex = i;
			}
		}

		temp = array[2];
		array[2] = array[maxIndex];
		array[maxIndex] = temp;
		System.out.println("После замены в):");
        System.out.println(Arrays.toString(array));

        int minIndex = 0;
        for (int i = 1; i<len; i++){
        	if (array[i]<=array[minIndex]){
        		minIndex = i;
        	}
        }
        temp = array[0];
        array[0] = array[minIndex];
        array[maxIndex] = temp;
        System.out.println("После замены г):");
        System.out.println(Arrays.toString(array));
	}
}