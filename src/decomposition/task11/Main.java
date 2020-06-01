package decomposition.task11;

public class Main {
    /*
    Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
    */
    public static void main(String[] args) {
        int a = 97851564;
        int b = 1534616;

        whichIslonger(a, b);
    }

    public static void whichIslonger(int a, int b) {
        if (lengthNumber(a) > lengthNumber(b)) {
            System.out.println("Число 'a' длиннее числа 'b'.");
        } else if (lengthNumber(a) == lengthNumber(b)) {
            System.out.println("Числа 'a' и 'b' равны по длине.");
        } else {
            System.out.println("Число 'b' длиннее числа 'a'.");
        }
    }

    public static int lengthNumber(int num) {
        num = Math.abs(num);
        int count = 1;
        while (num > 9) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
