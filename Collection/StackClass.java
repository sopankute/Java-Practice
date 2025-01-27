package Collection;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        Integer x = stack.peek();
        System.out.println(x);

        stack.add(1,40);        // vector method 
        stack.add(50);        // vector method 
        System.out.println(stack);
        System.out.println(stack.search(30));

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        







    }
}
