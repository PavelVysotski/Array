package twodim.task01;

import java.util.Scanner;

public class Main {
    /*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int m = input.nextInt();
        System.out.println("Введите количество столбцов: ");
        int n = input.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        showColumn(createArray(array, a, b));

    }

    public static int[][] createArray(int[][] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                array[i][j] = (int) (Math.random() * (b - a) + a);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }
    public static void showColumn (int[][] array){
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                if (j % 2 == 0 && array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
