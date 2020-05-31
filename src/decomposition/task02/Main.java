package decomposition.task02;

public class Main {
    /*
    Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    */
    public static void main(String[] args) {
        int a1 = 2;
        int a2 = 3;
        int a3 = 10;
        int a4 = 5;
        System.out.println(NOD4(a1, a2, a3, a4));
    }

    public static int NOD4(int a, int b, int c, int d) {
        return NOD(d, NOD(c, NOD(a, b)));
    }

    // алгоритм Евклида
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
