package Task5.CollectionClassesWithPolymorphism;
/*
Практическая
1. Старая конструкция как в сообщении А, Б, С класса.
Класс Б должен принимать также еще 1 тип объекта (класс Д). Также должен быть конструктор который работает на инициализации. Общая концепция такая:

B {
private List<Person> personList;
private D d;
B(LIst<Person> personList, D d) {
... }

getters/setters
}

Но(!) Класс B должен:
a. Реализовать полностью рабочий метод clone (также и класс А, Д)
b. Класс B должен геттеры\сетеры\clone использовать deep copy (https://www.geeksforgeeks.org/clone-method-in-java-2/)

2. Написать тесты, о том что происходит deepCopy (минимум 3 шт, которые показывает:
Что листы разные, что D разные, что Person - разные)
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonByPolymorphism person2 = new PersonByPolymorphism("Gerrard");
        PersonByPolymorphism person4 = new PersonByPolymorphism("Frik");
        PersonByPolymorphism person5 = new PersonByPolymorphism("Pedro");
        PersonByPolymorphism person6 = new PersonByPolymorphism("Gogo");
        PersonByPolymorphism person7 = new PersonByPolymorphism("Menes");
        AnotherPersonByPolymorphism person3 = new AnotherPersonByPolymorphism("Andru");
        CreatingFivePersonByThePolymorphism creatingFivePersonByThePolymorphism =
                new CreatingFivePersonByThePolymorphism(new ArrayList<>(), person3);
        creatingFivePersonByThePolymorphism.getPersonByPolymorphisms().add(person2);
        creatingFivePersonByThePolymorphism.getPersonByPolymorphisms().add(person4);
        creatingFivePersonByThePolymorphism.getPersonByPolymorphisms().add(person5);
        creatingFivePersonByThePolymorphism.getPersonByPolymorphisms().add(person6);
        creatingFivePersonByThePolymorphism.getPersonByPolymorphisms().add(person7);
        System.out.println(creatingFivePersonByThePolymorphism);


        CreatingFivePersonByThePolymorphism test1 = new CreatingFivePersonByThePolymorphism(new ArrayList<>(),person3);
        test1.setPersonByPolymorphisms(new ArrayList<>());
        test1.setAnotherPersonByPolymorphism(person3);
        CreatingFivePersonByThePolymorphism test2 = (CreatingFivePersonByThePolymorphism) test1.clone();
        test2.setPersonByPolymorphisms(new ArrayList<>());
        test2.getPersonByPolymorphisms().add(person2);
        test2.getPersonByPolymorphisms().add(person6);
        test2.setAnotherPersonByPolymorphism(person3);
        System.out.println(" this is a clone : " + "\n" + test2);
    }
}
