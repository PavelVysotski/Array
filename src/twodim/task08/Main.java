package twodim.task08;

import java.util.Scanner;

public class Main {
    /*
    В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.
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

        createArray(array, a,b);
        columnReplace(array, m);

    }

    public static void columnReplace(int[][] array, int m) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номера столбцов, которые необходимо переставить: ");
        int colum1 = input.nextInt();
        int colum2 = input.nextInt();
        int repl;
        for ( int i = 0; i < m; i++ ) {
            repl = array[i][colum1 - 1];
            array[i][colum1 - 1] = array[i][colum2 - 1];
            array[i][colum2 - 1] = repl;
        }
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
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
