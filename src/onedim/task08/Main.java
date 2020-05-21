package onedim.task08;

import java.util.Scanner;

public class Main {
    /*
    Дана последовательность целых чисел a1,a2,..,an . Образовать новую последовательность, выбросив из
    исходной те члены, которые равны min(a1,a2,..,an) .
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
        createNewArray(array, findMin(array));

    }

    public static int[] createArray(int[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int) (Math.random() * (b - a) + a);
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        return min;
    }

    public static void createNewArray(int[] array, int min) {
        int count = 0;
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] == min) {
                for ( int j = i; j < array.length - (count + 1); j++ ) {
                    array[j] = array[j + 1];
                }
                count++;
                i--;
            }
        }
        System.out.println("Массив после удаления минимального элемента: ");
        for ( int i = 0; i < array.length - count; i++ ) {
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
    }
}
