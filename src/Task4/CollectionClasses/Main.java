package Task4.CollectionClasses;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bill");
        Person person1 = new Person("Stiv");
        Person person2 = new Person("Klod");
        Person person3 = new Person("Suu");
        Person person4 = new Person("Fomil");

        CreatingFivePersonByTheCollection creatingFivePersonByTheCollection = new CreatingFivePersonByTheCollection();
        creatingFivePersonByTheCollection.getListOfPerson().add(person);
        creatingFivePersonByTheCollection.getListOfPerson().add(person1);
        creatingFivePersonByTheCollection.getListOfPerson().add(person2);
        creatingFivePersonByTheCollection.getListOfPerson().add(person3);
        creatingFivePersonByTheCollection.getListOfPerson().add(person4);
        System.out.println(creatingFivePersonByTheCollection.getListOfPerson());

        person3.setName("123456");
        System.out.println(creatingFivePersonByTheCollection.getListOfPerson());
    }
}
