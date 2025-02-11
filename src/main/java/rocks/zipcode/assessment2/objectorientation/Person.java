package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id = Long.MIN_VALUE;
    private String name = "";
    Address address = new Address();
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) { this.address = address;
    }

    @Override
    public boolean equals(Object o) {


        if (o == null) {
            return false;
        } else {
            return true;
        }
        //return (Boolean)null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}