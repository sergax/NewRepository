package Task5.CollectionClassesWithPolymorphism;

public class AnotherPersonByPolymorphism {
    private String anotherName;

    public AnotherPersonByPolymorphism(String anotherName) {
        this.anotherName = anotherName;

    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    @Override
    public String toString() {
        return " " + anotherName;
    }
}
