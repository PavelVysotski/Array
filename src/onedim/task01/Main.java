package onedim.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = input.nextInt();
        System.out.print("Введите число кратности: ");
        int k = input.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for ( int i = 0; i < n; i++ ) {
            array[i] = i + 1;
            if (array[i] % k == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма чисел кратные 'K' равна: " + sum);
    }
}
