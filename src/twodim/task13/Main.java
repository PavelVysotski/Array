package twodim.task13;

public class Main {
    /*
    Отсотрировать столбцы матрицы по возрастанию и убыванию значений элементов.
    */
    public static void main(String[] args) {

        int string = 4;
        int column = 7;
        int[][] array = new int[string][column];

        showArray(sortToMax(createArray(array), column));
        System.out.println();
        showArray(sortToMin(createArray(array), column));
    }
    public static int[][] createArray (int[][] array){
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
    public static int[][] sortToMax (int[][] array, int column){
        boolean sort;
        for (int i = 0; i < column; i++) {
            sort = false;
            while (!sort){
                sort = true;
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j][i] < array[j+1][i]) {
                        sort = false;
                        int buf = array[j][i];
                        array[j][i] = array[j+1][i];
                        array[j+1][i] = buf;
                    }
                }
            }
        }
        return array;
    }
    public static int[][] sortToMin (int[][] array, int column){
        boolean sort;
        for (int i = 0; i < column; i++) {
            sort = false;
            while (!sort){
                sort = true;
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j][i] > array[j+1][i]) {
                        sort = false;
                        int buf = array[j][i];
                        array[j][i] = array[j+1][i];
                        array[j+1][i] = buf;
                    }
                }
            }
        }
        return array;
    }
    public static void showArray (int[][] array){
        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array[i].length; j++ ) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}