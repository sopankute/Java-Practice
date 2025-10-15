package Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("Apple");
        queue.add("Cherryy");
        queue.add("Banana");
        queue.add("Apple");
        queue.add("Cherryy");

        System.out.println(queue);          // [Apple, Apple, Banana, Cherryy, Cherryy]

        System.out.println(queue.remove());             // Apple    remove Front element

        System.out.println(queue.poll());            // Apple    remove Front element
        
        System.out.println(queue.element());         // Apple
        
        System.out.println(queue.peek());            // Apple
        
        queue.offer("Orange");      // insert Element from Rear

        Iterator<String> itr = queue.iterator();

        while (itr.hasNext()) {
            System.out.print(" "+itr.next());       //  Apple Apple Banana Cherryy Cherryy Orange
        }

        // System.out.println(queue);
    }
}
