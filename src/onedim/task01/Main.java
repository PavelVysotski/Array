package onedim.task01;

import java.util.Scanner;

public class Main {
    /*
    В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    */
    public static void main(String[] args) {
        summa();
    }

    public static void summa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.print("Введите число кратности: ");
        int k = input.nextInt();
        for ( int i = 0; i < n; i++ ) {
            array[i] = i + 1;
            if (array[i] % k == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма чисел кратных 'K' равна: " + sum);
    }
}
