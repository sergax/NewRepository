package Task10;

public interface LinkedListMethods<E> {
    void add(E e);

    void add(E e, int index);

    void clear();

    E get(int index);

    int indexOf(E e);

    boolean remove(E e);

    E remove(int index);

    Object set(E e, int index);

    int size();
}
