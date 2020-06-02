package decomposition.task10;

public class Main {
    /*
    Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    являются цифры числа N.
    */
    public static void main(String[] args) {
        long n = -91998845004644l;

        long[] array = toArray(n);

        for ( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + ", ");
        }
    }

    public static long[] toArray(long n) {
        n = Math.abs(n);
        long copy = n;
        int length = 0;

        while (n > 0) {
            n = n / 10;
            length++;
        }
        long[] array = new long[length];
        for ( int i = array.length - 1; i >= 0; i-- ) {
            array[i] = copy % 10;
            copy = copy / 10;
        }
        return array;
    }
}
