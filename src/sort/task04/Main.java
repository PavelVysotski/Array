package sort.task04;

public class Main {
    /*
    Сортировка обменами. Дана последовательность чисел a1 <= a2 <=..<= an .Требуется переставить числа в
    порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai  ai+1 , то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
    */
    public static void main(String[] args) {
        int[] array = {23, 1, 8, 4, 0, -4, -15, 0, 3, 6, -18};

        int temp;
        boolean sort = false;
        int count = 0;
        while (!sort) {
            sort = true;
            for ( int i = 0; i < array.length - 1; i++ ) {
                if (array[i] > array[i + 1]) {
                    sort = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }
        for ( int i : array )
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Количество перестановок: " + count);
    }
}
