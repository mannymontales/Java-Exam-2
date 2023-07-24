package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal  {
    public Animal() {
    }

    private Long id;
    Person person = new Person();
    Address address = new Address();
    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = id;
        this.person = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public Person getOwner() {
        return person;
    }

    public void setOwner(Person owner) { this.person = owner;
    }

    public Address getAddress() {
        return address;
    }
}
