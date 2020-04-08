import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        Person a = new Person("Joe", "Smith", 40);
        Person b = new Person("Amy", "Gold", 32);
        Person c = new Person("Tony", "Stork", 21);
        Person d = new Person("Sean", "Irish", 24);
        Person e = new Person("Tina", "Brock", 28);
        Person f = new Person("Lenny", "Hep", 18);

        people.add(a);
        people.add(b);
        people.add(c);
        people.add(d);
        people.add(e);
        people.add(f);

        System.out.println("Sorting by age...");
        Collections.sort(people, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge()>o2.getAge()) return 1;
                else if (o1.getAge()==o2.getAge()) return -1;
                else return 0;
            }
        });
        System.out.println("Ascending:");
        for (Person i:people) {
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("Descending:");
        for (int i=people.size()-1; i>=0; i--) {
            System.out.println(people.get(i).toString());
        }

        System.out.println();
        System.out.println("Sorting by first name...");
        Collections.sort(people, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        System.out.println("Ascending:");
        for (Person i:people) {
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("Descending:");
        for (int i=people.size()-1; i>=0; i--) {
            System.out.println(people.get(i).toString());
        }

        System.out.println();
        System.out.println("Sorting by length of last name...");
        Collections.sort(people, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                if ((o1.getLastName()).length()>(o2.getLastName()).length()) return 1;
                else if ((o1.getLastName()).length()<(o2.getLastName()).length()) return -1;
                else return 0;
            }
        });
        System.out.println("Ascending:");
        for (Person i:people) {
            System.out.println(i.toString());
        }
        System.out.println();
        System.out.println("Descending:");
        for (int i=people.size()-1; i>=0; i--) {
            System.out.println(people.get(i).toString());
        }
    }
}
