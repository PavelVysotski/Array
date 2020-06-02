package decomposition.task06;

public class Main {
    /*
    Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    */
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 20;


        if (NOD3(a, b, c) == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не взаимно простые");
        }
    }

    public static int NOD3(int a, int b, int c) {
        return NOD(a, NOD(b, c));
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
