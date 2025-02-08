import java.util.Scanner;
public class Task13{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число строк n:");
		int n = scanner.nextInt();
		System.out.println("Введите число столбцов m:");
		int m = scanner.nextInt();
		double[][] matrix = new double[n][m];
		System.out.println("Введите элементы матрицы:");
		for (int i = 0;i<n;i++){
			for (int j = 0;j<n;j++){
				matrix[i][j] = scanner.nextDouble();
			}
		}
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		for (int i = 0;i<n;i++){
			for (int j = 0;j<n;j++){
				if (matrix[i][j]>max){
					max = matrix[i][j];
				}
				if (matrix[i][j]<min){
					min = matrix[i][j];
				}
			}
		}
		double average = (max+min)/2;
		System.out.println("Среднее арифметическое наибольшего и наименьшего значений матрицы: " + average);
	}
}