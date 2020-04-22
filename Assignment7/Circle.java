import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circle implements Shape, Serializable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Circle radius: " + radius + " area: " + df.format(this.computeArea());
    }
    @Override
    public double computeArea() {

        return radius * radius * 3.1415;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
