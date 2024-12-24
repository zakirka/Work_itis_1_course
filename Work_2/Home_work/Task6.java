import java.util.Scanner;
import java.lang.Math;
public class Task6{
	public Task6(){
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
System.out.println("Введите действительное число a:");
        double a = scanner.nextDouble();
        System.out.println("Введите натуральное число n:");
        int n = scanner.nextInt();

        System.out.println("_________________________________");
        
        // 1) a в степени n
        double result1 = Math.pow(a, n);
        System.out.println("a в степени n = " + result1);

        // 2) a * (a+1) * (a+2) * ... * (a+n-1)
        double result2 = 1;
        for (int i = 0; i < n; i++) {
            result2 *= (a + i);
        }
        System.out.println("a * (a+1) * ... * (a+n-1) = " + result2);

        // 3) 1/a + 1/(a*(a+1)) + 1/(a*(a+1)*...(a+n))
        double result3 = 0;
        double currentTerm = 1;
        for (int i = 0; i < n; i++) {
            currentTerm *= (a + i);
            result3 += 1 / currentTerm;
        }
        System.out.println("1/a + 1/(a*(a+1)) + ... = " + result3);

        // 4) 1/a + 1/a^2 + 1/a^4 + ... + 1/a^(2^n)
        double result4 = 0;
        for (int i = 0; i <= n; i++) {
            result4 += 1 / Math.pow(a, Math.pow(2, i));
        }
        System.out.println("1/a + 1/a^2 + 1/a^4 + ... = " + result4);

        // 5) a * (a-n) * (a-2n) * ... * (a-(n^2))
        double result5 = 1;
        for (int i = 0; i <= n; i++) {
            result5 *= (a - i * n);
        }
        System.out.println("a * (a-n) * (a-2n) * ... = " + result5);
    }
}
	