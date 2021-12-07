package Task8.Generics3;

import java.util.List;

class StudentOfMathClass<T> extends CoachClass implements ResolvingHomeTasks<Integer>{
    private T classID;

    public StudentOfMathClass(List<T> listOfSubjects, T subjectsName, T mark, Integer classID) {
        super(listOfSubjects, subjectsName, mark);
        this.classID = (T) classID;
    }
}
