import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        {
            if (o1.surname.length() < o2.surname.length()) {
                return 1;
            } else if (o1.surname.length() > o2.surname.length()) {
                return -1;
            } else return Integer.compare(o2.age, o1.age);
        }
    }
}
