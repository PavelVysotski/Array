package twodim.task15;

import java.util.Scanner;

public class Main {
    /*
    Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
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

replaceToMax(array, findMax(array));

    }

    public static int[][] createArray(int[][] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                array[i][j] = (int) (Math.random() * (b - a) + a);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static int findMax(int[][] array) {

        int max = array[0][0];
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максмальный элемент в массиве: " + max);
        return max;
    }

    public static int[][] replaceToMax(int[][] array, int max) {
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
}

