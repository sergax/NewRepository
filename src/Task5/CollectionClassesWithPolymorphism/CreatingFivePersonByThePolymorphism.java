package Task5.CollectionClassesWithPolymorphism;


import java.util.ArrayList;
import java.util.List;

public class CreatingFivePersonByThePolymorphism implements Cloneable {
    private List<PersonByPolymorphism> listOfpersonByPolymorphisms;
    private AnotherPersonByPolymorphism anotherPersonByPolymorphism;

    public CreatingFivePersonByThePolymorphism(List<PersonByPolymorphism> listOfpersonByPolymorphisms,
                                               AnotherPersonByPolymorphism anotherPersonByPolymorphism) {
        this.listOfpersonByPolymorphisms = listOfpersonByPolymorphisms;
        this.anotherPersonByPolymorphism = anotherPersonByPolymorphism;
    }

    public List<PersonByPolymorphism> getPersonByPolymorphisms() {
        return listOfpersonByPolymorphisms;
    }

    public void setPersonByPolymorphisms(List<PersonByPolymorphism> personByPolymorphisms) {
        this.listOfpersonByPolymorphisms = personByPolymorphisms;
    }

    public AnotherPersonByPolymorphism getAnotherPersonByPolymorphism() {
        return anotherPersonByPolymorphism;
    }

    public void setAnotherPersonByPolymorphism(AnotherPersonByPolymorphism anotherPersonByPolymorphism) {
        this.anotherPersonByPolymorphism = anotherPersonByPolymorphism;
    }

    @Override
    public String toString() {
        return "PersonByPolymorphisms : " + listOfpersonByPolymorphisms +
                "AnotherPersonByPolymorphism : " + anotherPersonByPolymorphism;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        CreatingFivePersonByThePolymorphism createTest = (CreatingFivePersonByThePolymorphism) super.clone();
        createTest.listOfpersonByPolymorphisms = new ArrayList<>();
        createTest.anotherPersonByPolymorphism = new AnotherPersonByPolymorphism("");
        return createTest;
    }
}
