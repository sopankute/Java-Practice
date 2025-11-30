// package GeneralProgram;

import java.util.*;

public class AccoliteProg{

    public static void main(String[] args) {
        
        String str = "hey fellow services";     // hey wollef secivres

        String[] arr = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String strs : arr){             // hey  | fellow | services
            if(strs.length() >= 5){ 
                String reversed = new StringBuilder(strs).reverse().toString();     // wollef
                sb.append(reversed);
            }
            else{
                sb.append(" ");
            }
        }

        System.out.println(sb.toString()+" ");

    }
}