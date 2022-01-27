package playtica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.doSomething();

        // another code
        List s = new ArrayList<>();
        s.add("wow");
        s.add(2);
        s.add(new Object());
        System.out.println(s.size());
        s.remove(new Object());
        System.out.println(s.size());
        s.remove(2);
        System.out.println(s.size());
        System.out.println(s);

        // another code
        Set<Object> set = new HashSet<>();
        set.add("1");
        set.add(1);
        set.add(null);
        set.add("null");
        System.out.println(set);

        // another code
        List l = new ArrayList();
        l.add(3, 4);
        l.add(1);
        l.add(1, 2);
        l.add(3);
        System.out.println(l);
    }
}
