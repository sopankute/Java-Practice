import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Comparator;

public class QueueDemo1 {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(87);
        queue.offer(34);
        queue.offer(56);
        queue.offer(12);
        queue.offer(76);

        System.out.println(queue);
        
        queue.offerFirst(54);
        queue.offerLast(43);
        
        System.out.println(queue.pollFirst());  // 54
        System.out.println(queue.pollLast());   // 43

        System.out.println(queue.peekFirst());  // 87
        System.out.println(queue.peekLast());   // 76

        System.out.println(queue);
    }
}
