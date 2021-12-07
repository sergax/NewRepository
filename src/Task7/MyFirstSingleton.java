package Task7;

public class MyFirstSingleton {
    public static MyFirstSingleton instance;

    public static MyFirstSingleton getInstance() {
        if (instance == null) {
            instance = new MyFirstSingleton();
        }
        return instance;
    }

    private MyFirstSingleton() {
    }

    public void print() {
        System.out.println(this);
    }
    public void doThis() {
        System.out.println("Do this");
    }

    public static void main(String[] args) {
        MyFirstSingleton.getInstance().print();
        MyFirstSingleton.getInstance().doThis();
    }
}

