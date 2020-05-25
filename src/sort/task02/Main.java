package sort.task02;

import java.util.Scanner;

public class Main {
    /*
    Даны две последовательности
    a1 <= a2 <=..<= an и b1 <= b2 <=..<= bm. Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер первого массива, в который будем вставлять второй массив: ");
        int m = input.nextInt();
        System.out.print("Введите размер второго массива, который будем вставлять в первый массив: ");
        int n = input.nextInt();
        int[] array1 = new int[n + m];
        int[] array2 = new int[n];
// Создаем два массива со случайными числами
        for ( int i = 0; i < m; i++ ) {
            array1[i] = (int) (Math.random() * (50 + 50) - 50);
        }
        for ( int i = 0; i < n; i++ ) {
            array2[i] = (int) (Math.random() * (50 + 50) - 50);
        }
// Сортируем их по возрастанию
        boolean sort = false;
        int temp1;
        int temp2;
        while (!sort) {
            sort = true;
            for ( int i = 0; i < m - 1; i++ ) {
                if (array1[i] > array1[i + 1]) {
                    sort = false;
                    temp1 = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temp1;
                }
            }
            for ( int i = 0; i < n - 1; i++ ) {
                if (array2[i] > array2[i + 1]) {
                    sort = false;
                    temp2 = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = temp2;
                }
            }
        }
        for ( int i = 0; i < m; i++ ) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < n; i++ ) {
            System.out.print(array2[i] + " ");
        }
//Вставляем второй массив в первый

        for ( int i = 0; i < n; i++ ) {
            array1[m + i] = array2[i];
        }
//Сортируем объединенный массив по возрастанию         
        sort=false;
        while (!sort) {
            sort = true;
            for ( int i = 0; i < array1.length-1; i++ ) {
                if (array1[i] > array1[i + 1]) {
                    sort = false;
                    temp1 = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = temp1;
                }
            }
        }
        System.out.println();
        for ( int i = 0; i < array1.length; i++ ) {
            System.out.print(array1[i] + " ");
        }
    }
}
