package Task8.Generics3;

import java.util.List;

class StudentOfPhysicClass<T> extends CoachClass{
    private T countOfStudent;

    public StudentOfPhysicClass(List<T> listOfSubjects, T subjectsName, T mark, T countOfStudent) {
        super(listOfSubjects, subjectsName, mark);
        this.countOfStudent = (T) countOfStudent;
    }
}
