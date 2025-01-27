public class ForEachLoop {
    
    public static void main(String[] args) {
        
        int [][] arr = {{4,3,2,1},
                        {6,5,4,3},
                        {8,7,6,5}};

        for(int[] x : arr){
            for(int e : x){
                System.out.print("  "+e);
            }
            System.out.println();
        }
    }
}
