package Collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(33);
        linkedList.add(76);
        linkedList.add(54);
        linkedList.addFirst(22);
        linkedList.addLast(99);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList);

        linkedList.remove(2);
        linkedList.removeFirst();
        linkedList.removeLast();
        
        linkedList.addAll(Arrays.asList(33, 76, 54));

        System.out.println(linkedList);

        linkedList.forEach(element->System.out.print("  "+element));
        
    }
}
