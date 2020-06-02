package decomposition.task05;

import java.util.Scanner;

public class Main {
    /*
    Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    которое меньше максимального элемента массива, но больше всех других элементов).
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();
        findPreMax(sortArray(createArray(array, a, b)));

    }

    public static int[] createArray(int[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int) (Math.random() * (b - a) + a);
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }

    public static int[] sortArray(int[] array) {
        int temp;
        for ( int i = 0; i < array.length - 1; i++ ) {
            for ( int j = 0; j < array.length - i - 1; j++ ) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        return array;
    }

    public static void findPreMax(int[] array) {
        System.out.println();
        int max = array[array.length-1];
        int preMax;
        for ( int i = array.length - 1; i >= 0; i-- ) {
            if (array[i-1] < max) {
                preMax = array[i-1];
                System.out.println("Второй по величине элемент: " + preMax);
                break;
            }
        }
    }
}
