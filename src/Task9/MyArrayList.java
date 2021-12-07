package Task9;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements ListMethods<E> {

    private static final int CAPACITY = 10;
    private int sizeOfArray;
    private E[] arrayList;

    public MyArrayList() {
        arrayList = (E[]) new Object[CAPACITY];
    }

    private void resize() {
        if (sizeOfArray == arrayList.length) {
            arrayList = Arrays.copyOf(arrayList,
                    arrayList.length * 2);
        }
    }

    private boolean chekByIndex(int indexOfArray) {
        if (indexOfArray < 0 || indexOfArray > sizeOfArray) {
            return false;
        }
        return true;
    }

    @Override
    public void add(E e) {
        resize();
        arrayList[sizeOfArray++] = e;
    }

    @Override
    public void add(E e, int indexOfArray) {
        if (chekByIndex(indexOfArray)) {
            resize();
            for (int i = indexOfArray; i < sizeOfArray; i++) {
                arrayList[i] = arrayList[i + 1];
            }
            arrayList[indexOfArray] = e;
            sizeOfArray++;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < sizeOfArray; i++) {
            arrayList[i] = null;
        }
        sizeOfArray = 0;
    }

    @Override
    public E get(int indexOfArray) {
        if (chekByIndex(indexOfArray)) {
            return arrayList[indexOfArray];
        }
        return null;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < sizeOfArray; i++) {
            if ((e != null && e.equals(arrayList[i])) ||
                    (e == null && arrayList[i] == null))
                return i;
        }
        return -1;
    }

    @Override
    public boolean remove(E e) {
        int index = indexOf(e);
        if (index == -1) {
            return false;
        }
        if (e.equals(arrayList[index])) {
            remove(index);
        }
        return true;
    }

    @Override
    public boolean remove(int indexOfArray) {
        if (chekByIndex(indexOfArray)) {
            System.arraycopy(arrayList,
                    indexOfArray + 1, arrayList, indexOfArray,
                    arrayList.length - 1 - indexOfArray);
            return true;
        }
        return false;
    }

    @Override
    public E set(E e, int indexOfArray) {
        if (chekByIndex(indexOfArray)) {
            E oldValue = arrayList[indexOfArray];
            arrayList[indexOfArray] = e;
            return oldValue;
        }
        return null;
    }

    @Override
    public int size() {
        return sizeOfArray;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyPatternIterator<>(arrayList);
    }
}
