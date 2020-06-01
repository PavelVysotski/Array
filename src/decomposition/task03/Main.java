package decomposition.task03;

public class Main {
    /*
    Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
    треугольника.
    */
    public static void main(String[] args) {
        double a = 6;
        System.out.println("Площадь правильного шестиугольника: " + 6 * areaTriangle(a));
    }

    public static double areaTriangle(double a) {
        return (a * a * Math.sqrt(3)) / 4;
    }
}
