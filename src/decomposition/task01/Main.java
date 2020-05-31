package decomposition.task01;

public class Main {
    /*
    Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    натуральных чисел:
    НОК(А,В) = (А * В) / НОД(А, В)
    */
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        System.out.println(NOD(a, b));
        System.out.println(NOK(a, b));
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
