import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public Task9() {
    }

    private static int[] genArray(int length, int max1, int min1) {
        Random random = new Random();
        int[] array = new int[length];

        for(int i = 0; i < length; ++i) {
            array[i] = random.nextInt(max1 - min1 + 1) + min1;
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину последовательности: ");
        int length = scanner.nextInt();
        System.out.println("Введите максимальный и минимальный элементы последовательности: ");
        int max1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int[] ints = genArray(length, max1, min1);
        int sum = 0;
        int cnt = 0;
        int[] var8 = ints;
        int var9 = ints.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            int temp = var8[var10];
            if (temp % 5 == 0 && temp % 7 != 0) {
                ++cnt;
                sum += temp;
                System.out.println(temp);
            }
        }

        System.out.println("Количество искомых элементов: " + cnt);
        System.out.println("Сумма искомых элементов: " + sum);
    }
}


