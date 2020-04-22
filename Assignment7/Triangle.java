import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Triangle implements Shape, Serializable {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Triangle base: " + base + " height: " + height + " area: " + df.format(this.computeArea());
    }
    @Override
    public double computeArea() {
        return .5 * base * height;
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
