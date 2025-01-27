package Practice;

import java.util.Arrays;

public class ArraysEqualorNot {
    public static void main(String[] args) {
        
        int[] arr1 = {3,5,6,7,9,2,6,3,2};
        int[] arr2 = {3,5,6,7,9,2,6,3,2};

        System.out.println(Arrays.equals(arr1, arr2));

        boolean flag = true;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("Not Equal");
                    flag = false;
                    break;
                }
            }

            if (flag) 
                System.out.println("Equal");            
        }else
            System.out.println("Not Equal");

    }
}
