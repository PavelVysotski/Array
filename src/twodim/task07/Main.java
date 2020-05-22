package twodim.task07;

import java.util.Scanner;

public class Main {
    /*
    Сформировать квадратную матрицу порядка n по правилу:
    a[i][j]=sin((i^2-j^)/n)
    и подсчитать количество положительных элементов в ней.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четное n не менее 2: ");
        int n = scanner.nextInt();
        while ((n % 2) != 0 || n < 2) {
            System.out.println("n должно быть четное и не меньше 2: ");
            n = scanner.nextInt();
        }
        double[][] array = new double[n][n];
        int count = 0;

        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                array[i][j] = Math.sin((i * i - j * j) / n);
                System.out.printf("%10.3f", array[i][j]);
                if (array[i][j] > 0) {
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Число положительных элементов: " + count);
    }
}
