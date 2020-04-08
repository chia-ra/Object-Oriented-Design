import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListManipulator {

    ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        //sort lowest to highest
        if (ascending) Collections.sort(myLst);
        else Collections.reverse((myLst));
        return myLst;

    }
    ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        ArrayList<Integer> copy = new ArrayList<>(myLst);

        copy = sort(copy, true);
        int largestIndex = myLst.size()-1;
        int a = myLst.indexOf((copy.get(0)));
        int b = myLst.indexOf((copy.get(largestIndex)));

        Collections.swap(myLst, a, b);
        return myLst;
    }

    void table (ArrayList<Integer> myLst) {
        sort(myLst, true);
        Map<Integer, Integer> myListHash = new HashMap<Integer, Integer>();
        for (Integer i:myLst) {
            Integer j = myListHash.get(i);
            myListHash.put(i, (j==null)? 1 : j+1); //store 1 if new entry, increment by 1 otherwise at key i
        }
        System.out.printf("%-22s%-22s\n", "Value", "Occurrences");
        for (Map.Entry<Integer, Integer> val : myListHash.entrySet()) {
            System.out.printf("%-22s%-22s\n", val.getKey(), val.getValue());
        }
    }


}
