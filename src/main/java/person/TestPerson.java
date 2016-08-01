package person;

/**
 * Created by svetlana on 31.07.16
 */

public class TestPerson {
    public static void main(String[] args) {

        Address address = new Address("Mendelsona", "Dnipro", 12, "Central", 49000);


        Person person1 = new Person("Dina", address.duplicate(), 13, 19);
        Person person2 = new Person("Dina", address.duplicate(), 13, 19);
        Person person3 = new Person("Masha", 24, 36); // I created new constructor without address,
                                                      // but I am not sure it is correct;
        Person person4 = new Person(address.duplicate(),34, 15); // I created new constructor without name,
        // but I am not sure it is correct;

        System.out.println("Is person1.equal(person2): " + person1.equals(person2));
        System.out.println("Is person3.equal(person1): " + person3.equals(person1));
        System.out.println("Is address of person3 equal person2: " + person3.getAddress().equals(person2.getAddress()));
        System.out.println("Is address of person4 equals to address of person1: " + person4.getAddress().equals(person1.getAddress()));
    }
}
