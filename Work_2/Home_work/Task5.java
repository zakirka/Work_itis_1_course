import java.util.Scanner;
public class Task5{
	public Task5(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину последовательности: ");
		int n = scanner.nextInt();
		if (n <= 0){
			System.out.println("Ошибка!");
			return;
		}
		double[] array = new double[n];
		System.out.println("Введите " + n + " чисел последовательности: ");
		for (int i=0;i<n;i++){
			array[i] = scanner.nextDouble();
			if (array[i] < 0){
				array[i] += 0.5;
			}
			else {
				array[i] = 0.1;
			}

		}
		System.out.println("________________________________");
		for (int i = 0;i<n;i++){
			System.out.println(array[i]);
		}
	}
}
