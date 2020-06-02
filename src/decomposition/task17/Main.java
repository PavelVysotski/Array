package decomposition.task17;

public class Main {
    /*
    Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
    действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
    */
    public static void main(String[] args) {
        int x = 35;

        System.out.println("Количество действий: " + countOfIteration(x));
    }

    public static int summOfDigit(int i) {
        int summ = 0;
        while (i > 0) {
            summ = summ + i % 10;
            i = i / 10;
        }
        return summ;
    }

    public static int countOfIteration(int x) {
        int count = 0;
        while (x != 0) {
            x = x - summOfDigit(x);
            count++;
        }
        return count;
    }
}
