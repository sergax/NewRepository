package Task9;

interface ListMethods<E> extends Iterable<E> {
    void add(E e);

    void add(E e, int index);

    void clear();

    E get(int index);

    int indexOf(E e);

    boolean remove(E e);

    boolean remove(int index);

    E set(E e, int index);

    int size();
}
