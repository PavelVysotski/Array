package twodim.task02;

import java.util.Scanner;

public class Main {
    /*
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер квадратной матрицы: ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createArray(array, a,b);
        System.out.println("Первая диагональ:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.println("Вторая диагональ:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i][array.length - 1 - i] + " ");
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
