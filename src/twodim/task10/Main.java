package twodim.task10;

import java.util.Scanner;

public class Main {
    /*
    Найти положительные элементы главной диагонали квадратной матрицы.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер квадратной матрицы: ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createArray(array, a, b);

        System.out.println("Положительные элементы главной диагонали: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.print(array[i][i] + " ");
            }
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
