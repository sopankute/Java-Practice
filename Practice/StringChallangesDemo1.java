package Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringChallangesDemo1 {

    public static void reverseString(){

        String str = "hello";

        char[] str1 = str.toCharArray();
        System.out.print("approach-1 & 2 : ");
        for(int i=str1.length-1; i>=0; i--){
            // System.out.print(str1[i]);               // approach-1
            System.out.print( str.charAt(i));           // approach-2
        }
        System.out.println();

        // approach-3
        StringBuffer SB = new StringBuffer(str);
        System.out.println("approach-3 : "+SB.reverse());
        
        // approach-3
        StringBuilder SB1 = new StringBuilder(str);
        System.out.println("approach-4 : "+SB1.reverse());  

    }

    // print Unique charachters from string
    public static void removeDuplicates(){

        String str = "Programming";

        // java 8
        // approach-1
        StringBuilder SB = new StringBuilder();
        // str.chars().distinct().forEach(c-> SB.append((char)c));             // Progamin
        // System.out.println(SB);
        // str.chars().distinct().forEach(c-> System.out.print((char)c));      // Progamin
        
        
         // approach-2          "Programming"
        StringBuilder SB1 = new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i+1); // check ch from i+1 index, if not present return -1
            if (idx==-1) {
                SB1.append(ch);     // appending unique character 
            }
        }
        System.out.println(SB1);

        // approach-3       "Programming"

        char[] str1 = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            boolean duplicat = false;
            for(int j=i+1; j<str.length(); j++){
                if (str1[i]==str1[j]) {
                    duplicat = true;
                }
            }
            if (!duplicat) {
                System.out.print(str1[i]);
            }
        }
        System.out.println();

        // approach-4       "Programming"
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
        }
        set.forEach(e->System.out.print(e));
    }

    public static void  reverseEachWord(){

        String str = "java code";
        String[] words = str.split(" ");
        
        // String output="";

        for (String word : words) {
            String reverseString = "";
            for(int i=word.length()-1; i>=0; i--){
                reverseString = reverseString + word.charAt(i);
            }
            // output = output + reverseString + " ";
            System.out.print(reverseString+" ");
        }
        // System.out.print(output);
    }

    public static void charFreqInString(){

        

    }


    public static void main(String[] args) {       
        // reverseString();
        // removeDuplicates();
        // reverseEachWord();
        charFreqInString();
    }
}
