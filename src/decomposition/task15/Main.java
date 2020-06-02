package decomposition.task15;

import java.util.Scanner;

public class Main {
    /*
    Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число 'n': ");
        int n = input.nextInt();

        findNumbers(n);
    }

    public static int[] createArray(int number, int n) {
        int[] array = new int[n];
        for ( int i = 0; i < n; i++ ) {
            array[n - 1 - i] = number % 10;
            number = number / 10;
        }
        return array;
    }

    public static void findNumbers(int n) {
        int a = (int) Math.pow(10, n - 1);
        int b = (int) (Math.pow(10, n) - 1);
        for ( int i = a; i <= b; i++ ) {
            int[] array = createArray(i, n);
            int count = 0;
            for ( int j = 1; j < n; j++ ) {
                if (array[j] == array[j - 1] + 1) {
                    count++;
                }
            }
            if (count == n - 1) {
                System.out.printf(i + ", ");
            }
        }
    }


}
