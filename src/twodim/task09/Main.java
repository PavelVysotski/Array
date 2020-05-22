package twodim.task09;

import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.HTMLDocument;
import java.util.Scanner;

public class Main {
    /*
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму.
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
        while (a < 0) {
            System.out.println("Числа должны быть положительными: ");
            a = input.nextInt();
        }
        int b = input.nextInt();

        createArray(array, a, b);
        sumAllColumn(array, m, n);
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

    public static void sumAllColumn (int[][] array, int m, int n){
        int sumColumn = 0;
        int sumMax = 0;
        for ( int i = 0; i < n; i++ ) {
            sumColumn = 0;
            for ( int j = 0; j < m; j++ ) {
                sumColumn = sumColumn + array[j][i];
            }
            System.out.println("Сумма столбца №" + (i + 1) + " равна: " +sumColumn);
            if (sumColumn > sumMax) {
                sumMax = sumColumn;
            }
        }
        System.out.println("Максимальная сумма столбцов: " + sumMax);
    }
}
