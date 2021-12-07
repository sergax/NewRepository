package Task9;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertSame;

public class MyArrayListTest {
    @Test
    void testMyListAddObjectIndex() {

        MyArrayList<String> strings = new MyArrayList<>();
        for (int i = 0; i < 1000; i++) {
            strings.add("first");
            strings.add("second");
            strings.add("third");
        }

        ArrayList<String> newStrings = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            newStrings.add("first");
            newStrings.add("second");
            newStrings.add("third");
        }
        for (int i = 0; i < 1000; i++) {
            assertSame(newStrings.get(0), strings.get(0));
            assertSame(newStrings.get(8), strings.get(8));
            assertSame(newStrings.get(879), strings.get(879));
        }
    }

    @Test
    void testMyListRemoveObject() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        ArrayList<String> newStrings = new ArrayList<>();
        newStrings.add("fourth");
        newStrings.add("second");
        newStrings.add("third");

        strings.remove("third");
        strings.remove("second");

        newStrings.remove("second");
        newStrings.remove("third");

        assertSame(strings.get(1), newStrings.get(0));

    }

    @Test
    void testMyListRemoveIndex() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        ArrayList<String> newStrings = new ArrayList<>();
        newStrings.add("first");
        newStrings.add("second");
        newStrings.add("third");

        strings.remove(0);
        strings.remove(3);

        newStrings.remove(0);

        assertSame(strings.get(0), newStrings.get(0));
    }

    @Test
    void testMyListSet() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        ArrayList<String> newStrings = new ArrayList<>();
        newStrings.add("first");
        newStrings.add("second");
        newStrings.add("third");

        strings.set("Changed", 0);
        strings.set("Changed1", 1);
        strings.set("Changed2", 2);
        strings.set("Changed3", 3);

        newStrings.set(0, "Changed");
        newStrings.set(1, "Changed1");
        newStrings.set(2, "Changed2");

        assertSame(strings.get(0), newStrings.get(0));
        assertSame(strings.get(1), newStrings.get(1));
        assertSame(strings.get(2), newStrings.get(2));
    }

    @Test
    void testMyListIndexOf() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");
        strings.add(null);

        ArrayList<String> newStrings = new ArrayList<>();
        newStrings.add("first");
        newStrings.add("second");
        newStrings.add(null);

        assertSame(4, strings.indexOf(null));
        assertSame(2, newStrings.indexOf(null));
    }

    @Test
    void testMyListClear() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        ArrayList<String> newStrings = new ArrayList<>();
        newStrings.add("first");
        newStrings.add("second");
        newStrings.add(null);

        strings.clear();
        newStrings.clear();

        assertSame(0, strings.size());
        assertSame(0, newStrings.size());
    }

    @Test
    void testMyListSize() {
        MyArrayList<String> strings = new MyArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        ArrayList<String> newStrings = new ArrayList<>();
        newStrings.add("first");
        newStrings.add("second");
        newStrings.add(null);

        assertSame(4, strings.size());
        assertSame(3, newStrings.size());
    }
}
