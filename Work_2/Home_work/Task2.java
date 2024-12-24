import java.util.Scanner;
public class Task2 {
	public Task2() {
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива:");
		int len = scanner.nextInt();
		int[] array = new int[len];
		System.out.println("Введите целые числа: ");
		for (int i=0;i<len;i++){
			array[i] = scanner.nextInt();
		}
		int flag = 0;	
		int count = 0;
		for (int i = 0; i < len; i++) {
            if (array[i]%2==0 && array[i]>array[i-1] && array[i]>array[i+1]){
            	count++;	

        	}
        }	
        if (count == 2){
        	System.out.println("True");
        }
        else {
        	System.out.println("False");
        }
	}
}        	