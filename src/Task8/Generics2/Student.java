package Task8.Generics2;

public class Student {
    private final Object left;
    private final  Object right;

    public Student(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public Object getLeft() {
        return left;
    }

    public Object getRight() {
        return right;
    }
}
