package practice.date910;

class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(3);
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(Circle.getTotal());
    }
}

public class Circle {
    private double radius;
    private int id;
    private static int total;//记录圆的个数
    private static int init = 1001;//

    public Circle() {
        id = init++;
        total++;
    }
    public Circle(double radius) {
        id = init++;
        this.radius = radius;
        total++;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }
}
