package sort.task01;

import java.util.Scanner;

public class Main {
    /*
    Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер первого массива, в который будем вставлять второй массив: ");
        int m = input.nextInt();
        System.out.print("Введите размер второго массива, который будем вставлять в первый массив: ");
        int n = input.nextInt();
        int[] array1 = new int[n + m];
        int[] array2 = new int[n];

        for ( int i = 0; i < m; i++ ) {
            array1[i] = (int) (Math.random() * 15);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < n; i++ ) {
            array2[i] = (int) (Math.random() * 15);
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        System.out.print("Введите номер элемента, начиная с которого будет вставлен второй массив в первый: ");
        int k = input.nextInt();
        while (k < 0 || k > m) {
            System.out.println("Номер не может быть отрицательным, или выходить за пределы размера первого массива: ");
            k = input.nextInt();
        }

        for ( int i = 0; i < m - k; i++ ) {
            array1[array1.length - 1 - i] = array1[m - i - 1];
        }
        for ( int i = 0; i < n; i++ ) {
            array1[k + i] = array2[i];
        }
        System.out.println();
        for ( int i = 0; i < n + m; i++ ) {
            System.out.print(array1[i] + " ");
        }
    }
}
