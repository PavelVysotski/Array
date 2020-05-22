package twodim.task14;

public class Main {
    /*
    14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
    */
    public static void main(String[] args) {
        showArray(createArray());
    }

    public static int[][] createArray() {
        int m = (int) Math.round(Math.random() * (10 - 1) + 1);
        int n = (int) Math.round(Math.random() * m);
        int[][] array = new int[m][n];

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < i + 1 && j < m; j++ ) {
                array[j][i] = 1;
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
