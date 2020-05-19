package onedim.task04;

import java.util.Scanner;

public class Main {
    /*
    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        double[] array = new double[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        createArray(array, a, b);
        changeArray(array);
    }

    public static double[] createArray(double[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (Math.random() * (b - a)) + a;
            System.out.print("[" + i + "]: " + array[i] + ", ");
        }
        System.out.println();
        return array;
    }

    public static int minElement(double[] array) {
        int mini = 0;
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] < array[mini]) {
                mini = i;
            }
        }
        return mini;
    }

    public static int maxElement(double[] array) {
        int maxi = 0;
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] > array[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }

    public static void changeArray(double[] array) {
        double temp = 0;
        int maxi = maxElement(array);
        int mini = minElement(array);
        System.out.println("Массив после замены.");
        temp = array[maxi];
        array[maxi] = array[mini];
        array[mini] = temp;
        for ( double i : array )
            System.out.print("  " + i + ", ");
    }
}


