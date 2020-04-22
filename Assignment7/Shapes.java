import java.io.Serializable;
import java.util.ArrayList;

public class Shapes extends Thread implements Serializable {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public Shapes(ArrayList shapeList) {
        this.shapeList = shapeList;
    }
    public void add(Shape s) {
        shapeList.add(s);
    }
    public void remove(Shape s) {
        shapeList.remove(s);
    }
    synchronized public void compute() {
            for (Object o : shapeList) {
                System.out.println(o.toString());
            }
            System.out.println();
    }
    public Shape max() {
        //return shape with biggest area
        try { //check if theres anything in shapelist
            Shape max = shapeList.get(0);
            for (Shape o:shapeList) {
                if (max.computeArea() < o.computeArea()) {
                    max = o;
                }
            }
            return max;
        }
        catch (NullPointerException e) {
            System.out.println("Error: Shape list empty");
        }
        return null;
    }
    public Shape min() {
        try {
            Shape min = shapeList.get(0);
            for (Shape o:shapeList) {
                if (min.computeArea() > o.computeArea()) {
                    min = o;
                }
            }
            return min;
        }
        catch (NullPointerException e) {
            System.out.println("Error: Shape list empty");
        }
        return null;
    }


    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }
}
