package practice.date907;

class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.findArea());
        System.out.println(c1.toString());
    }
}

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super("white",1.0);
        radius = 1.0;
    }
    public Circle(double radius) {
        super("white",1.0);
        this.radius = radius;
    }
    public Circle(double radius, String color, double weight) {
        super(color,weight);
        this.radius = radius;
    }


    public double findArea() {
        return Math.PI * radius * radius;
    }

    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle tmp = (Circle) obj;
            return this.radius == tmp.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
