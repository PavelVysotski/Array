package onedim.task09;

import java.util.Scanner;

public class Main {
    /*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createArray(array, a, b);

        int count;
        int countMax = 1;
        for ( int i = 0; i < array.length; i++ ) {
            count = 1;
            for ( int j = i + 1; j < array.length; j++ ) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            array2[i] = count;
            if (count > countMax) {
                countMax = count;
            }
        }

        System.out.println("Количество последующих совпадений: ");
        int min = array[0];
        for ( int i = 0; i < array2.length; i++ ) {
            if (array2[i] == countMax && array[i] < min) {
                min = array[i];
            }
            System.out.print("[" + i + "]: " + array2[i] + ", ");
        }
        System.out.println("Минимальный из повторов: " + min);
    }

    public static int[] createArray(int[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int) (Math.random() * (b - a) + a);
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }
}
