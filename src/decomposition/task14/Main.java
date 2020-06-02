package decomposition.task14;

import java.util.Scanner;

public class Main {
    /*
    Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
    использовать декомпозицию.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 'k': ");
        int k = input.nextInt();

        showAllArmstrNumb(k);
    }

    public static void showAllArmstrNumb(int k) {
        for ( int i = 1; i <= k; i++ ) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int digit = 0;
        int copy = n;
        int length = lengthNumber(n);

        while (n > 0) {
            digit = n % 10;
            sum += Math.pow(digit, length);
            n = n / 10;
        }
        return sum == copy;
    }

    public static int lengthNumber(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
