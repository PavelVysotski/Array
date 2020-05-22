package twodim.task12;

public class Main {
    /*
    Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    */
    public static void main(String[] args) {

        showArray(sortToMax(createArray()));
        System.out.println();
        showArray(sortToMin(createArray()));
    }

    public static int[][] createArray() {
        int[][] array = new int[5][7];
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }

    public static int[][] sortToMax(int[][] array) {
        boolean sort;
        int temp = 0;
        for ( int i = 0; i < array.length; i++ ) {
            sort = false;
            while (!sort) {
                sort = true;
                for ( int j = 0; j < array[i].length - 1; j++ ) {
                    if (array[i][j] > array[i][j + 1]) {
                        sort = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static int[][] sortToMin(int[][] array) {
        boolean sort;
        int temp = 0;
        for ( int i = 0; i < array.length; i++ ) {
            sort = false;
            while (!sort) {
                sort = true;
                for ( int j = 0; j < array[i].length - 1; j++ ) {
                    if (array[i][j] < array[i][j + 1]) {
                        sort = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static void showArray(int[][] array) {
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
