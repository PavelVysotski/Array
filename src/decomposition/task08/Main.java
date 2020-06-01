package decomposition.task08;

import java.util.Arrays;

public class Main {
    /*
    Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до m.
    */
    public static void main(String[] args) {
        int k = 7;
        int m = 18;
        int[] array = {-1, 1, 0, 4, 5, 8, 9, 12, 14, 7, 5, -7, -9, 24, 25};


        for ( int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();
        for ( int i = k; i < m - 1; i += 3 ) {
            int sum = 0;
            i = i - 1;
            if (i >= array.length - 2) {
                System.out.println("В массиве не достаточно элементов для суммы последующих трех.");
                break;
            } else {
                sum = array[i] + array[i + 1] + array[i + 2];
                System.out.println(sum);
            }
        }
    }
}
