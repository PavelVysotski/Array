package sort.task03;

public class Main {
    /*
    Сортировка выбором. Дана последовательность чисел a1 <= a2 <=..<= an .Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором.
    */
    public static void main(String[] args) {
        int[] array = {-5, 4, -10, 0, 2, -7, 15, 14, 3, 9, 0};
        for ( int i = 0; i < array.length; i++ ) {
            int max = array[i];
            int maxI = i;
            for ( int j = i + 1; j < array.length; j++ ) {
                if (array[j] > max) {
                    max = array[j];
                    maxI = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxI] = temp;
            System.out.print(array[i]+" ");
        }
    }
}
