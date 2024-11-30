public class Task8 {
    public Task8() {
    }

    public static boolean hasEvenLocalMaximum(int[] sequence) {
        for(int i = 1; i < sequence.length - 1; ++i) {
            if (sequence[i] > sequence[i - 1] && sequence[i] > sequence[i + 1] && sequence[i] % 2 == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] sequence = new int[]{1, 3, 2, 4, 6, 3, 7};
        if (hasEvenLocalMaximum(sequence)) {
            System.out.println("В последовательности есть четный локальный максимум.");
        } else {
            System.out.println("В последовательности нет четного локального максимума.");
        }

    }
}
