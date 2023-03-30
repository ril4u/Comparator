public class Person {
    private String name;
    protected String surname;
    protected int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // создайте toString
    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.age;
    }

    /*@Override
    public int compareTo(Person o1) {
        if (surname.length() > o1.surname.length()) {
            return 1;
        } else if (surname.length() < o1.surname.length()) {
            return -1;
        } else return Integer.compare(age, o1.age);*/
}
