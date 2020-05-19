package onedim.task05;

import java.util.Scanner;

public class Main {
    /*
    Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createArray(array, a, b);
        condition(array);
    }

    public static int[] createArray(int[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int) (Math.random() * (b - a) + a);
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }

    public static void condition(int[] array) {
        System.out.println("Массив после выполнения условия: ");
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] > i) {
                System.out.print("[" + i + "]: " + array[i] + ", ");
            }
        }
    }
}
