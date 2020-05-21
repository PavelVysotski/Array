package onedim.task10;

import java.util.Scanner;

public class Main {
    /*
    Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createNewArray(createArray(array, a, b));

    }

    public static int[] createArray(int[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int) (Math.random() * (b - a) + a);
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }

    public static void createNewArray(int[] array) {
        for ( int i = 1; i < array.length; i++ ) {
            for ( int j = i; j < array.length - 1; j++ ) {
                array[j] = array[j + 1];
                array[j + 1] = 0;
            }
        }
        System.out.println("Массив после сдвига и замены: ");
        for ( int i = 0; i < array.length; i++ ) {
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
    }
}
