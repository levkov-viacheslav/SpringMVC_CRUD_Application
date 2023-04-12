package levkov.dao;

import levkov.models.Person;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private static int people_count;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++people_count, "Tom"));
        people.add(new Person(++people_count, "Bob"));
        people.add(new Person(++people_count, "Mike"));
        people.add(new Person(++people_count, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
