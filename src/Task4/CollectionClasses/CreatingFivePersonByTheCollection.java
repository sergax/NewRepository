package Task4.CollectionClasses;
/*
4. Инкапсуляция:
Создать класс, внутри которого будет коллекция класса в котором будет 1 поле:
Все делать ТОЛЬКО через getters setters, все поля приватные.
class A {
List<B> list
}
class B{
String name
}
    а) Создать 5 объектов класса Б со случайными  именами.
    б) Создать объект класса А, и внести в его коллекцию 5 объектов класса Б
    с) Вывести в консоль все имена.
    д) Поменять имя в любом объекте класса Б
    г) Вывести в консоль все имена повторно с листа.
Подумать почему лист поменялся, хотя он же приватный.
Сделать так чтоб изминения не влияли. Можно захардкодить.
 */

import java.util.ArrayList;
import java.util.List;

public class CreatingFivePersonByTheCollection {

    private List<Person> listOfPerson;

    public CreatingFivePersonByTheCollection() {
        listOfPerson = new ArrayList<>();
    }

    public List<Person> getListOfPerson() {
        return listOfPerson;
    }
}
