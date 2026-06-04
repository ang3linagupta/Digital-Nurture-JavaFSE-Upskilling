package Exercise29;

import java.util.List;

record Person(String name,int age){}

public class RecordsDemo {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ananya",25),
                new Person("Aryan",17),
                new Person("Karan",30)
        );

        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(System.out::println);
    }
}