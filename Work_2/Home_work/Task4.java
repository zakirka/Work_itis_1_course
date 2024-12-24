import java.util.Scanner;
import java.lang.Math;
public class Task4{
	public Task4(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел: ");
		int length = scanner.nextInt();
		int count = 0;
		System.out.println("Введите " + length + "чисел: ");
		for (int i = 0;i<length;i++){
			int number = scanner.nextInt();
			int len_number = (int) Math.log10(Math.abs(number))+1;
			
			if (len_number == 3 || len_number == 5){
				int abs_numb = Math.abs(number);
				boolean allEven = true;
				boolean allOdd = true;
				while (abs_numb > 0){
					int digit = abs_numb%10;
					if (digit % 2 !=0){
						allEven = false;
					}
					if (digit % 2 == 0){
						allOdd = false;
					}
					abs_numb /= 10;
				}
				if (allEven || allOdd){
					count++;
				}
			}
		}
		if (count == 2){
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}
