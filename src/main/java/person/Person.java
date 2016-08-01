package person;

/**
 * Created by svetlana on 31.07.16
 */
public class Person {
    private String name;
    private Address address;
    private int id;
    private int age;

    public Person(String name, Address address, int id, int age) {
        if(name.length() == 0) {
            name = "Anonymous";
        }

        if(id < 0) {
            id = 0;
        }

        if(age < 0) {
            age = 0;
        }
        this.name = name;
        this.address = address;
        this.id = id;
        this.age = age;
    }

    public Person(String name, int id, int age) {
        this.address = new Address("", "", 0, "", 0);
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Person(Address address, int id, int age) {
        this.name = "Anonymous";
        this.address = address;
        this.id = id;
        this.age = age;
    }


    public String getName() {

        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            age = 0;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " id: " + id + " address: " + address + " age: " + age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person person = (Person) o;

        return name.equals(person.name) && address.equals(person.address) &&
                id == person.id && age == person.age;
    }
}
