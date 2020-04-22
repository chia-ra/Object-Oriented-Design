import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ShapeTest extends Thread{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Shapes tester = new Shapes(shapes);

        Triangle t1 = new Triangle(12.5, 6);
        Triangle t2 = new Triangle(4.1, 5.5);
        tester.add(t1);
        tester.add(t2);

        Rectangle r1 = new Rectangle(7.3, 4);
        Rectangle r2 = new Rectangle(3.9, 6.8);
        tester.add(r1);
        tester.add(r2);

        Circle c1 = new Circle(12.3);
        Circle c2 = new Circle(9);
        tester.add(c1);
        tester.add(c2);

        Hexagon h1 = new Hexagon(7.2);
        Hexagon h2 = new Hexagon(4.8);
        tester.add(h1);
        tester.add(h2);

        System.out.println("Min: " + tester.min().toString());
        System.out.println("Max: " + tester.max().toString());
        System.out.println();

        new Thread() {
            public void run() {
                tester.compute();
            }
        }.start();
        new Thread() {
            public void run() {
                tester.compute();
            }
        }.start();

        try {
            for (int i=0; i>tester.getShapeList().size(); i++) {
                FileOutputStream streamOut = new FileOutputStream("./obj" + (i+1) + ".ser");
                ObjectOutputStream objectOutput = new ObjectOutputStream(streamOut);
                objectOutput.writeObject(tester.getShapeList().get(i));
                objectOutput.close();
                streamOut.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
