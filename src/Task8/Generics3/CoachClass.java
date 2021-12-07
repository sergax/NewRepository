package Task8.Generics3;

import java.util.List;

abstract class CoachClass<T> implements ResolvingClassTasks {
    private List<T> listOfSubjects;
    private T subjectsName;
    private T mark;

    public CoachClass(List<T> listOfSubjects, T subjectsName, T mark) {
        this.listOfSubjects = listOfSubjects;
        this.subjectsName = subjectsName;
        this.mark = mark;
    }

    public List<T> getListOfSubjects() {
        return listOfSubjects;
    }

    public T getSubjectsName() {
        return subjectsName;
    }

    public T getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "CoachClass{" +
                    "listOfSubjects=" + listOfSubjects +
                    ", subjectsName=" + subjectsName +
                    ", mark=" + mark +
                    '}';
    }
}

