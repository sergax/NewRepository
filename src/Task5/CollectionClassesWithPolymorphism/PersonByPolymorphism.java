package Task5.CollectionClassesWithPolymorphism;

import java.util.Objects;

public class PersonByPolymorphism {
    private String name;
    int value;

    public PersonByPolymorphism(String name) {
        this.name = name;
    }

    public PersonByPolymorphism (int value,String name) {
        this(name); // уменьшение кода
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonByPolymorphism that = (PersonByPolymorphism) o;
        return value == that.value && Objects.equals(name, that.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
