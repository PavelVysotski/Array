package onedim.task07;

import java.util.Scanner;

public class Main {
    /*
    Даны действительные числа a1,a2,...,an . Найти
    max( a1 + a2n,a2 + a2n−1,....,an + an+1) .
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = input.nextInt();
        double[] array = new double[n];
        System.out.println("Введите диапазон вставляемых чисел от 'a' до 'b': ");
        int a = input.nextInt();
        int b = input.nextInt();

        findMax(createNewArray(createArray(array, a, b)));
    }

    public static double[] createArray(double[] array, int a, int b) {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (Math.random() * (b - a) + a);
            System.out.printf("%10.3f", array[i]);
        }
        System.out.println();
        return array;
    }

    public static double[] createNewArray(double[] array) {
        double[] array2 = new double[array.length / 2];
        for ( int i = 0; i < array2.length; i++ ) {
            array2[i] = array[i] + array[array.length-1-i];
            System.out.printf("%10.3f", array[i]);
        }
        System.out.println();
        return array2;
    }

    public static void findMax (double[] array) {
        double max= array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент нового массива: "+max);
    }
}
