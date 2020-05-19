package onedim.task02;

import java.util.Scanner;

public class Main {
    /*
    Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
    числом. Подсчитать количество замен.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();
        double[] array = new double[n];
        System.out.println("Введите число для замены: ");
        double z = input.nextDouble();

        createArray(array, a, b);
        changeArray(array, z);
    }

    public static void createArray(double array[], int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (Math.random() * (b - a)) + a;
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
    }

    public static int changeArray(double array[], double z) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Массив после замены.");
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        System.out.println("Количество замен равно: " + count);
        return count;
    }
}
