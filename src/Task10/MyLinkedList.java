package Task10;

public class MyLinkedList<E> implements LinkedListMethods<E> {
    public MyLinkedList() {
    }

    private static class Node<E> {
        private E e; //element which we wanna add
        private Node<E> next; // reference for next element

        private Node(E e) {
            this.e = e;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private boolean chekByIndex(int indexOfLinkedList) {
        if (indexOfLinkedList < 0 || indexOfLinkedList > size) {
            return false;
        }
        return true;
    }

    private Node<E> getNodeByIndex(int indexOfLinkedList) {
        Node<E> current = head;
        for (int i = 0; i < indexOfLinkedList; i++) {
            current = current.next;
        }
        return current;
    }

    //My imagine : [n[ref]] <-> [n[ref]] <-> [n[ref]] <-> [n[ref]]
    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        //if list empty we add element at 1st and last node
        if (size == 0) {
            head = tail = newNode;
        }
        //add elements to next node
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public void add(E e, int indexOfLinkedList) {
        if (chekByIndex(indexOfLinkedList)) {
            Node<E> newNode = new Node<>(e);
            //if list empty we add element at 1st and last node
            if (head == null) {
                head = tail = newNode;
            } else if (indexOfLinkedList == 0) {
                newNode.next = head;
                head = newNode;
            } else if (indexOfLinkedList == size) {
                tail.next = newNode;
                tail = newNode;
            } else {
                //reference in previous node
                Node<E> previousIndex = getNodeByIndex(indexOfLinkedList - 1);
                newNode.next = previousIndex.next;
                previousIndex.next = newNode;
            }
            size++;
        }
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public E get(int indexOfLinkedList) {
        if (chekByIndex(indexOfLinkedList)) {
            return getNodeByIndex(indexOfLinkedList).e;
        }
        return null;
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        int outOfBound = -1;
        Node<E> current = head;
        while (current != null) {
            if (current.equals(current.e)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return outOfBound;
    }

    @Override
    public boolean remove(E e) {
        Node<E> current = head;
        Node<E> previous = null;
        while (current != null) {
            if (e.equals(current.e)) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
            } else {
                previous = current;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public E remove(int indexOfLinkedList) {
        if (chekByIndex(indexOfLinkedList)) {
            //move to previous index which we want to remove
            E removedElement;
            if (indexOfLinkedList == 0) {
                removedElement = head.e;
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                Node<E> previousIndex = getNodeByIndex(indexOfLinkedList - 1);
                removedElement = previousIndex.next.e;
                previousIndex.next = previousIndex.next.next;
                if (indexOfLinkedList == size - 1) {
                    tail = previousIndex;
                }
            }
            size--;
            return removedElement;
        }
        return null;
    }

    @Override
    public E set(E e, int indexOfLinkedList) {
        if (chekByIndex(indexOfLinkedList)) {
            //get element by index
            Node<E> node = getNodeByIndex(indexOfLinkedList);
            return node.e = e;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
