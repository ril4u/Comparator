import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int number;

    public PersonComparator(int number) {
        this.number = number;
    }

    @Override
    public int compare(Person o1, Person o2) {
        {
            String[] lengthSurname1 = o1.surname.split(" ");
            String[] lengthSurname2 = o2.surname.split(" ");

            if ((lengthSurname2.length > number - 1) && (lengthSurname1.length > number - 1)) {
                return Integer.compare(o2.age, o1.age);
            } else if (lengthSurname2.length > lengthSurname1.length) {
                return 1;
            } else if (lengthSurname1.length > lengthSurname2.length) {
                return -1;
            } else return Integer.compare(o2.age, o1.age);

        }
    }
}
