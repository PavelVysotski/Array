package onedim.task06;

import java.util.Scanner;

public class Main {
    /*
    Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        double[] array = new double[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createArray(array, a, b);
        sumSimple(array);

    }

    public static double[] createArray(double[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (Math.random() * (b - a) + a);
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }

    public static void sumSimple(double[] array) {
        double sum = 0;
        for ( int i = 2; i < array.length; i++ ) {
            int count = 0;
            for ( int j = 2; j <= i && count < 2; j++ ) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count < 2)
                sum += array[i];
        }
        System.out.println("Сумма чисел с простым индексом равна: " + sum);
    }
}





