package sort.task06;

public class Main {
    /*
    Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
    на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки.
    */
    public static void main(String[] args) {
        int[] array = {4, -1, 8, 15, -23, -12, 0, 3, 14, -15, 7};

        for ( int i = 0; i < array.length - 1; ) {
            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                if (i > 0) {
                    i--;
                }
            }
        }
        for ( int i : array )
            System.out.print(i + " ");
    }
}

