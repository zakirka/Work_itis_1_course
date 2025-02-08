import java.util.Scanner;
import java.lang.Math;
public class Task12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк n:");
		int n = scanner.nextInt();
		System.out.println("Введите количество столбцов m:");
		int m = scanner.nextInt();
		double[][] matrix = new double[m][n];
		System.out.println("Введите элементы матрицы:");
		double maxAbsValue = 0;
		for (int i = 0; i<n;i++){
			for (int j = 0;j<m;j++){
				matrix[i][j] = scanner.nextDouble();
			}
		}
		for (int i = 0; i<n;i++){
			for (int j = 0;j<m;j++){
				double absValue = Math.abs(matrix[i][j]);
				if (absValue>maxAbsValue){
					maxAbsValue = absValue;
				}	
			}
		}
		if (maxAbsValue != 0){
			for (int i=0;i<n;i++){
				for (int j=0;j<m;j++){
					matrix[i][j] /= maxAbsValue;
					System.out.printf("%.2f ", matrix[i][j]);
				}
				System.out.println();
			}
		}

	}
}