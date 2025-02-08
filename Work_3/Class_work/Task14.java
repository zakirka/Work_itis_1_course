import java.util.Scanner;
public class Task14{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = 3;
		int[][] matrix = new int[n][n];
		System.out.println("Введите элементы матрицы:");
		for (int i = 0;i<n;i++){
			for (int j = 0;j<n;j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		boolean isFound = false;
		for (int i = 0;i<n;i++){
			for (int j = 0;j<n;j++){
				if (matrix[i][j]!=0){
					System.out.println("Ненулевой элемент найден по индексу: [" + i + "][" + j + "]");
					isFound = true;
					break;
				}	
			}
			if (isFound){
				break;
			}
		}
		System.out.println();

		for (int i = 0;i<n;i++){
			for (int j = 0;j<n;j++){
				if (matrix[i][j]!=0){
					System.out.println("Ненулевой элемент найден по индексу: [" + i + "][" + j + "]");
				}
			}
		}
	}
}