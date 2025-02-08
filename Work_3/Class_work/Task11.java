import java.util.Scanner;

public class Task11{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество строк матрицы: ");
        int n = scanner.nextInt();		
		double[][] matrix = new double[n][9];
		System.out.println("Введите числа в матрицу: ");
		for (int i = 0;i<n;i++){
			for (int j = 0;j<9;j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		double[] columnAverage = new double[9];
		for (int j = 0;j<9;j++){
			double sum = 0;
			for (int i = 0;i<n;i++){
				sum+=matrix[i][j];
			}
			columnAverage[j] = sum/n;
		}
		System.out.println("Среднее арифметическое каждого столбца:");
		for (int j=0;j<9;j++){
			System.out.printf("Столбец %d: %.2f%n", j+1, columnAverage[j]);
		}
		System.out.println("Среднее арифметическое для столбцов с четными номерами:");
		for (int j=1;j<9;j+=2){
			System.out.printf("Столбец %d: %.2f%n", j+1, columnAverage[j]);
		}
	}
}