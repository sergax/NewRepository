package playtica;

import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.TreeSet;

@AllArgsConstructor
public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num1;
    private  int num2;

    @Override
    public int compareTo(Sorted s) {
        return Integer.compare(num2, s.num2);
    }

    @Override
    public int compare(Sorted s1, Sorted s2) {
        return Integer.compare(s1.num1, s2.num1);
    }

    @Override
    public String toString() {
        return "" + num1;
        }

    public static void main(String[] args) {

        Sorted s1 = new Sorted(44, 20);
        Sorted s2 = new Sorted(55, 10);
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }
}
