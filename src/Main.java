import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> znat = new ArrayList<>();
        znat.add(new Person("Ivan", "Petrov", 24));
        znat.add(new Person("Kolya", "Ivanov", 26));
        znat.add(new Person("Nina", "Geerafov", 33));
        znat.add(new Person("Ira", "Arbuzov", 8));
        znat.add(new Person("Petr", "Petrenko", 43));
        System.out.println(znat);

        Collections.sort(znat,new PersonComparator());
        System.out.println(znat);

    }
}