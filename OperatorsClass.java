public class OperatorsClass{


    public static void main(String[] args) {
        Thread t = new Thread();

        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Object);
        System.out.println(t instanceof Runnable);
       
        int x =10, y=15;

        if(++x<10 || ++y>15)        
            x++;
        else    
            y++;

            System.out.println(x+"     "+y);
    }
}
    //  Object
    //    |
    // Runnable
    //    |
    //  Thread      <--- t