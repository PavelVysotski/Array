package decomposition.task04;

import java.util.Arrays;

public class Main {
    /*
    На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
    */
    public static void main(String[] args) {

            int[][] coordination = { { 0, 0 }, { 4, 8 }, { -7, 14 }, { 14, -7 }, { -24, 15 }, { 0, 0 }, { -5, -5 } };

            maxDist(coordination);
        }

        public static void maxDist(int[][] coordination) {
            double maxDist = 0;
            double temp = 0;
            int dotA = 0;
            int dotB = 0;

            for (int i = 0; i < coordination.length; i++) {
                for (int j = 0; j < coordination.length; j++) {
                    temp = distAB(coordination[i][0], coordination[i][1], coordination[j][0], coordination[j][1]);
                    if (temp > maxDist) {
                        maxDist = temp;
                        dotA = i;
                        dotB = j;
                    }
                }
            }
            System.out.println(
                    "Максимальное расстояние между" + Arrays.toString(coordination[dotA]) + " и " + Arrays.toString(coordination[dotB]));
        }

        // находим расстояние между 2-мя точками
        public static double distAB(int x, int y, int x1, int y1) {
            return Math.sqrt(Math.pow(Math.abs(x1 - x), 2) + Math.pow(Math.abs(y1 - y), 2));
    }
}
