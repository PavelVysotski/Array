package decomposition.task12;

public class Main {
    /*
    Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    являются числа, сумма цифр которых равна К и которые не большее N.
    */
    public static void main(String[] args) {
        int k = 9;
        int n = 250;
        System.out.println("Массив с элементами, сумма цифр которых равна " + k + ", в диапазоне от 0 до " + n);

        int[] a = createArray(countOfNumbers(n, k), n, k);
        showArray(a);

    }

    public static int countOfNumbers(int n, int k) {
        int count = 0;
        for ( int i = 0; i < n; i++ ) {
            if (summOfNumbers(i) == k) {
                count++;
            }
        }
        return count;
    }

    public static int summOfNumbers(int i) {
        int summ = 0;

        while (i > 0) {
            summ = summ + i % 10;
            i = i / 10;
        }

        return summ;
    }

    public static int[] createArray(int count, int n, int k) {
        int[] array = new int[count];
        int j = 0;
        for ( int i = 0; i < n; i++ ) {

            if (summOfNumbers(i) == k) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }

    public static void showArray(int[] array) {
        for ( int i = 0; i < array.length; i++ ) {
            System.out.printf(array[i] + ", ");
        }
    }
}
