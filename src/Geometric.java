public class Geometric {

    public static void main(String[] args) {
        System.out.println("=== Square ===");
        System.out.println("Area");
        System.out.println(squareArea(10.0));
        System.out.println(squareArea(20.0));
        System.out.println("Perimeter");
        System.out.println(squarePerimeter(100.0));
        System.out.println(squarePerimeter(4.123));
        System.out.println();
        System.out.println("=== Rectangle ===");
        System.out.println("Area");
        System.out.println(rectangleArea(1.0, 4.0));
        System.out.println(rectangleArea(7.0, 9.0));
        System.out.println("Perimeter");
        System.out.println(rectanglePerimeter(190.56, 345.7));
        System.out.println();
        System.out.println("=== Volumes ===");
        System.out.println("Zone of a sphere");
        System.out.println(zoneSphere(12.0, 45.0, 95.934));
        System.out.println("Cylindrical sphere");
        System.out.println(cylinderSphere(66.66));
        System.out.println("Ungula");
        System.out.println(ungula(1.0, 3.0));
    }

    private static double squareArea(double x) {
        System.out.println("x = " + x);
        return x * x;
    }

    private static double squarePerimeter(double x) {
        System.out.println("x = " + x);
        return 4 * x;
    }

    private static double rectangleArea(double x, double y) {
        System.out.println("x = " + x + " y = " + y);
        return x * y;
    }

    private static double rectanglePerimeter(double x, double y) {
        System.out.println("x = " + x + " y = " + y);
        return 2 * (x + y);
    }

    private static double zoneSphere(double x, double y, double z) {
        System.out.println("x = " + x + " y = " + y + " z = " + z);
       return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    private static double cylinderSphere(double r) {
        System.out.println("r = " + r);
        return (Math.PI * Math.pow(r, 3)) / 6;
    }

    private static double ungula(double x, double y) {
        System.out.println("x = " + x + " y = " + y);
        return (2 * x * y) / 3;
    }
}
