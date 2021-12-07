package Task11;
/*
add(K k, V v)
size()
remove(K k)
remove(V v) - ремув только 1 входящего.
removeAll(V v) ремув всех v
getValueByKey(K k)
getKeyByValue(Value value) - только 1
getKeysByValue(Value value ) - получаем все
 */

import lombok.AllArgsConstructor;
import lombok.Data;

public class MyHashMap<K, V> implements MethodsOfHashMap<K, V> {

    @AllArgsConstructor
    @Data
    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
        }
    }

    private final int SIZE = 1 << 4;


    private Entry<K, V> table[];

    public MyHashMap() {
        table = new Entry[SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];
        if (e == null) {
            table[hash] = new Entry<K, V>(key, value);
        } else {
            while (e.next != null) {
                if (e.getKey() == key) {
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey() == key) {
                e.setValue(value);
                return;
            }
            e.next = new Entry<K, V>(key, value);
        }
    }

    public V getValueByKey(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) return null;
        while (e != null) {
            if (e.getKey() == key) {
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }

    public Entry<K, V> remove(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) return null;

        if(e.getKey() == key) {
            table[hash] = e.next;
            e.next = null;
            return e;
        }

        Entry<K, V> prev = e;
        e = e.next;

        while (e != null) {
            prev.next = e.next;
            e.next = null;
            return e;
        }
        return null;
    }
}
