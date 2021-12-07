package Task8.Generics3;

import java.util.List;

interface ResolvingClassTasks<T> {

    default void displayMarksForTasks(List<? extends CoachClass> listClassTasks, Integer idTask) {
        System.out.println("List/id of tasks: " + listClassTasks + "/" + idTask);
    }
}
