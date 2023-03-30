import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> znat = new ArrayList<>();
        znat.add(new Person("Ivan", "Petrov Voronov", 24));
        znat.add(new Person("Kolya", "Van Damm", 26));
        znat.add(new Person("Nina", "Geerafov Ugnov", 33));
        znat.add(new Person("Ira", "Pacco Ra Bane", 8));
        znat.add(new Person("Petr", "Petrenko", 43));
        znat.add(new Person("Eva", "Obe Van Kee Noo Bee", 3));
        znat.add(new Person("Mary", "Obe Van Kee Noo Bee", 80));
        System.out.println(znat);

        znat.sort(new PersonComparator(3));
        System.out.println(znat);

    }
}