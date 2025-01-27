public class TryCatchFinally {


    public static void main(String[] args) {
        
        try{
            System.out.println("Inside try{}");
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("Inside catch(){}");
            e.printStackTrace();
        }finally{
            System.out.println("Inside finally{}");
        }

        System.out.println("TryCatchFinally.main() | After finally{}");
    }
}
