package Task9;
//Используется для перебора множества элементов.

import java.util.Iterator;

public class MyPatternIterator<E> implements Iterator {
    private E[] objects;
    private int index = 0;

    MyPatternIterator(E[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public E next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        MyPatternIterator<Integer> m = new MyPatternIterator(array);

        while (m.hasNext()) {
            Integer i = m.next();
            System.out.print(i + " ");
        }
    }
}
