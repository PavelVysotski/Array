package twodim.task11;

import javax.swing.text.html.HTMLDocument;

public class Main {
    /*
    Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.
    */
    public static void main(String[] args) {


        findMax(createArray());

    }

    public static int[][] createArray() {
        int[][] array = new int[10][20];
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

    public static void findMax(int[][] array) {
        int count = 0;
        for ( int i = 0; i < array.length; i++ ) {
            count = 0;
            for ( int j = 0; j < array[i].length; j++ ) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("В строке №" + (i + 1) + " число 5 встречается не менее трех раз.");
            }
        }
        System.out.println();
    }
}
