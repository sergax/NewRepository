package Task7;
//
public class NewClass {
    String name;
    String surname;
    String age;
    String countOfAnimals;

    public NewClass(String name, String surname, String countOfAnimals, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.countOfAnimals = countOfAnimals;
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass("Sergey","Ivanov", "19","2");


    }
}
