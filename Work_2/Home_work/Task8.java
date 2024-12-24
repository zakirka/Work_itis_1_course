import java.util.Scanner;
import java.lang.Math;
public class Task8{
	public Task8(){
	}
	public static void main(String[] args){
		System.out.println("Введите длину массива: ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		double[] arrays = new double[length];
		int k = 1;
		for (int i = 0;i!=length;i++){
			arrays[i] = (Math.pow((-1),i))*k;
			k+=2;
		}
		for (double arr : arrays){

			System.out.println(arr);
		}
	}
}