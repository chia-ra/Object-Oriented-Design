import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Hexagon implements Shape, Serializable {
    private double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        return "Hexagon side length: " + sideLength + " area: " + df.format(this.computeArea());
    }
    @Override
    public double computeArea() {
        return 2.5981 * sideLength * sideLength; //from area of regular hexagon = ((3*sqrt(3))/2)*sidelength^2
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
