class Circle {
    double area(int r) {
        return 3.14 * r * r;
    }

    double area(double r) {
        return 3.14 * r * r;
    }
}

public class Method {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area with int radius: " + c.area(10));
        System.out.println("Area with double radius: " + c.area(10.0));
    }
}
