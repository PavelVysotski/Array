package decomposition.task07;

public class Main {
    /*
    Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    */
    public static void main(String[] args) {
        System.out.println(sumFactOdd());

    }

    public static int sumFactOdd() {
        int sum = 0;
        for ( int i = 1; i <= 9; i += 2 ) {
            sum += fact(i);
        }
        return sum;
    }

    public static int fact(int n) {
        int result = 1;
        for ( int i = 1; i <= n; i++ ) {
            result = result * i;
        }
        return result;
    }
}
