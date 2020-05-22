package twodim.task04;

import java.util.Scanner;

public class Main {
    /* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    1  2   3  ... n
    n n-1 n-2 ... 1
    1  2   3  ... n
    ...............
    n n-1 n-2 ... 1
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четное n не менее 2: ");
        int n = scanner.nextInt();
        while ((n % 2) != 0 || n < 2) {
            System.out.println("n должно быть четное и не меньше 2: ");
            n = scanner.nextInt();
        }
        int[][] array = new int[n][n];

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if (i % 2 == 0) {
                    array[i][j] = j + 1;
                } else {
                    array[i][j] = n - j;
                }
            }
        }
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
