import java.io.Serializable;

public class Rectangle implements Shape, Serializable {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "Rectangle base: " + base + " height: " + height + " area: " + this.computeArea();
    }
    @Override
    public double computeArea() {
        return base * height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
