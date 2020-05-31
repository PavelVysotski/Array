package sort.task08;

public class Main {
    /*
    Даны дроби p1/q1, p2/q2,..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
    знаменателю и упорядочивает их в порядке возрастания.
    */
    public static void main(String[] args) {
        int[] array1 = { 3, 6, 2, 8, 4, 2, 9, 13, 28 };
        int[] array2 = { 4, 2, 7, 7, 6, 2, 7, 3, 14 };
        int NOK = array2[0];

        for (int i = 1; i < array2.length; i++) {
            NOK = NOK(NOK, array2[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            array1[i] = (NOK / array2[i]) * array1[i];
            array2[i] = NOK;
        }

        for (int i = 0; i < array1.length; i++) {
            int maxIndex = i;
            for (int j = i; j < array1.length; j++) {
                if (array1[maxIndex] > array1[j]) {
                    maxIndex = j;
                }
            }
            int buf = array1[maxIndex];
            array1[maxIndex] = array1[i];
            array1[i] = buf;
        }

        for (int i: array1)
            System.out.print(i+", ");
        System.out.println();
        for (int i: array2)
            System.out.print(i+", ");
    }

    public static int NOK(int a, int b) {
        return a * b / NOD(a, b);
    }

    public static int NOD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}
