import java.util.Scanner;

public class Task14 {
    public Task14() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел (n): ");
        int n = scanner.nextInt();
        System.out.print("Введите индекс элемента, который нужно исключить (i): ");
        int i = scanner.nextInt();
        double[] array = new double[n];
        System.out.println("Введите " + n + " чисел:");

        for(int j = 0; j < n; ++j) {
            array[j] = scanner.nextDouble();
        }

        double totalSum = 0.0;
        double[] var7 = array;
        int var8 = array.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            double num = var7[var9];
            totalSum += num;
        }

        double excludedElement = array[i - 1];
        double adjustedSum = totalSum - excludedElement;
        double average = adjustedSum / (double)(n - 1);
        System.out.println("Среднее арифметическое (без элемента a[" + i + "]): " + average);
    }
}


