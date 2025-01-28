
public class ThreadGroupClass {
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getThreadGroup().getName());      // main
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());      // system

        ThreadGroup pGroup = new ThreadGroup("My Thread Group");    
        System.out.println(pGroup.getName());                           // My Thread Group
        System.out.println(pGroup.getParent().getName());               // main

        ThreadGroup cGroup = new ThreadGroup(pGroup,"Child Thread Group");
        System.out.println(cGroup.getName());                   // Child Thread Group
        System.out.println(cGroup.getParent().getName());       // My Thread Group

    }
}

// system   -> main -> My Thread Group  -> Child Thread Group