package Collection;

import java.util.LinkedList;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>(7, 5);

        System.out.println(vector.capacity());  // capacity by default - 10 increment by 2 times/ can manually mention

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(33);
        linkedList.add(76);
        linkedList.add(54);

        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);
        
    }
}
