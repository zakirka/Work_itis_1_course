import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первый член арифметической прогрессии a: ");
		int a = scanner.nextInt();
		System.out.println("Введите разность арифметической прогрессии q: ");
		int q = scanner.nextInt();
		int[] progress = new int[10];
		for (int i = 1;i<10;i++){
			progress[0] = a;
			progress[i]=progress[0]+q*i;
		}
		
		int[] fb = new int[20];
		for (int i = 2;i<20;i++){
			fb[0] = 1;
			fb[1] = 1;
			fb[i] = fb[i-1]+fb[i-2];
		}
		System.out.println("Первые 10 членов арифметической прогрессии с первым членом прогрессии " + a + " и ее разностью " + q);
		for (int par : progress){
			System.out.println(par);
		}
		System.out.println("Первые 20 членов последовательности Фибоначи:");
		for (int arr:fb){
			System.out.println(arr);
		}
	}
}