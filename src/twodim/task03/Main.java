package twodim.task03;

import java.util.Scanner;

public class Main {
    /*
    Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
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

        createArray(array, a, b);

        System.out.println("Введите номер строки: ");
        int k = input.nextInt();
        System.out.println("Введите номер столбца: ");
        int p = input.nextInt();
        System.out.println("Строка:");
        for ( int i = 0; i < n; i++ ) {
            System.out.print(array[k - 1][i] + " ");
        }
        System.out.println();

        System.out.println("Столбец:");
        for ( int i = 0; i < m; i++ ) {
            System.out.println(array[i][p - 1] + " ");
        }
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
}
