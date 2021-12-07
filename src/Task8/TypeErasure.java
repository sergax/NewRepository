package Task8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {
//Объяснение: здесь, когда мы компилируем код, он не выдает никаких предупреждающих
// сообщений на экран консоли, потому что здесь мы используем Type Erasure.

        List<String> newType = new ArrayList<>();
        newType.add("One");
        Iterator<String> iter = newType.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }
    }
}

class TypeErasure2 {
    public static void main(String[] args) {
//
//        List newType2 = new ArrayList();
//        newType2.add("Two");
//        String s;
//        for(Iterator iter2 = newType2.iterator(); iter2.hasNext();
//            System.out.println(s);
//            s =(String)

    }
}
