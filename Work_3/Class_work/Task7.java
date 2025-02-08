import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива:");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Введите элементы массива:");
		for (int i = 0; i < n; i++){
			array[i] = scanner.nextInt();
		}
		System.out.println("Введите индекс k1:");
		int k1 = scanner.nextInt();
		System.out.println("Введите индекс k2:");
		int k2 = scanner.nextInt();
		System.out.println("Введите индекс s1:");
		int s1 = scanner.nextInt();
		System.out.println("Введите индекс s2:");
		int s2 = scanner.nextInt();

		double sum = 0;
		double product = 1;
		double sqr_sum = 0;
		double sum_6 = 0;
		double sum_k = 0;
		double midl = 0;
		double midl_s = 0;


		for (int i = 0; i < n; i++){
			sum+=array[i];
			product*=array[i];
			sqr_sum+=array[i]*array[i];
			if (i<6){
				sum_6+=array[i];
			}
			else {
				break;
			}
			if ((k2>k1) && (i>(k1-1)) && (i<=k2)){
				sum_k+=array[i];
			}
			midl = sum/n;
			int sum_s = 0;
			if ((s2>s1) && (i>(s1-1)) && (i<=s2)){
				sum_s+=array[i];
				midl_s = sum_s/(s2-s1+1);
			}
		}
		System.out.println("Cумма всех элементов массива: " + sum);
		System.out.println("Произведение всех элементов массива: "  + product);
		System.out.println("Сумма квадратов всех элементов массива: " + sqr_sum);
		System.out.println("Сумму первых шести элементов массива: " + sum_6);
		System.out.println("Cумму элементов массива с k1-го по k2-й: " + sum_k);
		System.out.println("Среднее арифметическое всех элементов массива: " + midl);
		System.out.println("Среднее арифметическое элементов массива с s1-го по s2-й: " + midl_s);

	}
}