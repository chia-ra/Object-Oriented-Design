import java.util.ArrayList;

public class MethodTest {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("apples");
        strings.add("oranges");
        strings.add("bananas");
        strings.add("grapes");
        strings.add("pears");

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(13);
        ints.add(14);
        ints.add(15);
        ints.add(16);
        ints.add(17);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(11.2);
        doubles.add(12.3);
        doubles.add(13.4);
        doubles.add(14.5);
        doubles.add(15.6);
        doubles.add(16.7);
        doubles.add(17.8);
        doubles.add(19.0);

        count(strings);
        System.out.println();
        count(ints);
        System.out.println();
        count(doubles);


    }
    private static <E> void count(ArrayList a) {
        //count num of elem in a list of generic elems
        //int size = 0;
        //for (Object o: a) {
        //    size++;
        //}
        System.out.println("Number of elements: " + a.size());


    }
}
