package Task10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

abstract class AbstractTestCase {
    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
    LinkedList<String> linkedList = new LinkedList<>();

    @Before
    public void addElement() {
        myLinkedList.add("Byte");
        myLinkedList.add("Short");
        myLinkedList.add("Integer");
        myLinkedList.add("Long");
        myLinkedList.add("Char", 4);
        myLinkedList.add("Float", 5);
        myLinkedList.add("Double", 6);
        myLinkedList.add("Boolean", 7);

        linkedList.add("Byte");
        linkedList.add("Short");
        linkedList.add("Integer");
        linkedList.add("Long");
        linkedList.add(4, "Char");
        linkedList.add(5, "Float");
        linkedList.add(6, "Double");
        linkedList.add(7, "Boolean");
    }
}

public class MyLinkedListTest extends AbstractTestCase {

    @Test
    public void testMyLinkedListAdd() {
        for (int i = 0; i < myLinkedList.size(); i++) {
            assertSame(myLinkedList.get(i), linkedList.get(i));
        }
    }

    @Test
    public void testMyLinkedListClear() {
        myLinkedList.clear();
        linkedList.clear();

        assertSame(myLinkedList.size(), 0);
    }

    @Test
    public void testMyLinkedListIndexOf() {
        assertSame(myLinkedList.indexOf("Float"), linkedList.indexOf("Float"));
    }

    @Test
    public void testMyLinkedListRemove() {
        myLinkedList.remove(1);
        myLinkedList.remove("Byte");

        linkedList.remove(1);
        linkedList.remove("Byte");

        assertSame(myLinkedList.get(1), linkedList.get(1));
    }
}

