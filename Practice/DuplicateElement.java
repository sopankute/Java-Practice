package Practice;

public class DuplicateElement {
    public static void main(String[] args) {
        
        int[] arr = {3,5,6,7,2,45,0,1,9,2,6,3,1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i] ==arr[j]) {
                    count++;
                    System.out.println("  "+arr[i]+"  : "+count);
                }
            }
        }


    }
}
