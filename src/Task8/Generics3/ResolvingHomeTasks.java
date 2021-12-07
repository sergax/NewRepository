package Task8.Generics3;

import java.util.List;

interface ResolvingHomeTasks<T> {

    //return only objects this interface
    default void displayHomeTasks(List<String> listHomeTasks) {
        listHomeTasks.add("Geometry");
        listHomeTasks.add("Algebra");
        listHomeTasks.add("Kibernatic");
        System.out.println("Our exercise for home: " + listHomeTasks);
    }
}
