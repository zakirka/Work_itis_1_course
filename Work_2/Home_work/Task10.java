import java.util.Scanner;

public class Task10 {
    public Task10(){
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int n = scanner.nextInt();
        
        
        String result = getAgeDeclension(n);
        
        
        System.out.println(n + " " + result);
        
        scanner.close();
    }
    
    public static String getAgeDeclension(int n) {
        int lastDigit = n % 10;
        int lastTwoDigits = n % 100;

    
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "лет"; 
        } else if (lastDigit == 1) {
            return "год";  
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return "года"; 
        } else {
            return "лет";  
        }
    }
}
