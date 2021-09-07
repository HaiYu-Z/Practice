package practice.date907;

import java.lang.reflect.GenericArrayType;

public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {}
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
