package decomposition.task13;

public class Main {
    /*
    Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    решения задачи использовать декомпозицию.
    */
    public static void main(String[] args) {
        int n = 15;

        int[] array = createArrayOfSimpleNumber(n);
        System.out.println("Числа-близнецы в диапазоне от " + n + " до " + 2 * n);
        findTwins(array);

    }

    public static boolean simpleNumber(int number) {
        for ( int i = 2; i < number; i++ ) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countSimpleNumber(int n) {
        int count = 0;
        for ( int i = n; i <= 2 * n; i++ ) {
            if (simpleNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public static int[] createArrayOfSimpleNumber(int n) {
        int size = countSimpleNumber(n);
        int[] array = new int[size];
        int j = 0;

        for ( int i = n; i <= 2 * n; i++ ) {
            if (simpleNumber(i)) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    public static void findTwins(int[] array) {
        for ( int i = 0; i < array.length - 1; i++ ) {
            if (array[i + 1] == array[i] + 2) {
                System.out.printf("[%d] [%d]", array[i], array[i + 1]);
                System.out.println();
            }
        }
    }
}
