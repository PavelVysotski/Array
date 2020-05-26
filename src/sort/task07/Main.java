package sort.task07;

public class Main {
    /*
    Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <=..<= an и b1 <= b2 <=..<= bm .
    Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <=..<= bm в первую
    последовательность так, чтобы новая последовательность оставалась возрастающей.
    */
    public static void main(String[] args) {
        int[] array1 = { -14, -10, -3, 0, 7, 14, 21, 30 };
        int[] array2 = { -16, -7, 1, 8, 13, 17, 23, 29, 32, 37 };

        for ( int i : array1 )
            System.out.print(i + " ");
        System.out.println();
        for ( int i : array2 )
            System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            int index = binSearch(array1, 0, array1.length, array2[i]);
            System.out.printf("Элемент %d между %d и %d\n", array2[i], index, index + 1);
        }

    }

    private static int binSearch(int[] mas, int sortedBegin, int soredEnd, int number) {
        int middle = (sortedBegin + soredEnd) / 2;

        if ((soredEnd - sortedBegin) / 2 == 0) {
            if (mas[middle] > number) {
                return middle;
            } else {
                return middle + 1;
            }
        }

        if (mas[middle] > number) {
            return binSearch(mas, sortedBegin, middle, number);
        } else {
            return binSearch(mas, middle, soredEnd, number);
        }
    }
}
