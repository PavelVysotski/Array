package onedim.task03;

import java.util.Scanner;

public class Main {
    /*
    Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        double[] array = new double[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (Math.random() * (b - a)) + a;
            System.out.printf("%10.3f", array[i]);
            if (array[i] < 0) {
                minus++;
            }
            if (array[i] == 0) {
                zero++;
            }
            if (array[i] > 0) {
                plus++;
            }
        }
        System.out.println();
        System.out.println("Отрицательных: " + plus+" Равных нулю: " + zero + " Отрицательных: "+minus);
    }
}
