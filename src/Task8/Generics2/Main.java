package Task8.Generics2;

public class Main {
    public static void main(String[] args) {
        final Student student1 = new Student(1,"Old method");
        final String name = (String)student1.getRight();
        System.out.println(name);
        final Student2<String> student2 = new Student2<>("Generics","<> generics");
        System.out.println(student2.getLeft() + " " + student2.getRight());
    }
}
