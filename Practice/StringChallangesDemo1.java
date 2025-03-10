package Practice;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
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

        Map<Character, Integer> map = new HashMap<>();
        String str = "hello";
        char[] str1 = str.toCharArray();

       for(char ch : str1){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int count = map.get(ch);
                map.put(ch, count+1);
            }
       }

       System.out.println(map);     // {e=1, h=1, l=2, o=1}
    }

    // Without Collection
    public static void firstNonRepeatedCharInString1(){

        String str = "AABCDBE";

        for(int i=0; i<str.length(); i++){
            boolean unique = true;
            for(int j=0; j<str.length(); j++){          // compare ch from 0 to str.length()-1
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    // repeated
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    // Without Collection
    public static void firstNonRepeatedCharInString2(){ 

        String str = "AABCDBE";

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
        System.out.println(map);
    }

    public static void replaceCharWithItsOccurrence(){

        String str = "OPENTEXT";
        char ch = 'T';

        if(str.indexOf(ch) == -1){
            System.out.println("Given char not present");
            System.exit(0);
        }

        char[] str1 = str.toCharArray();
        int count=1;

        for(int i=0; i<str1.length; i++){
            
            if (str1[i] == ch) {
                str1[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(Arrays.toString(str1));
    }


    public static void main(String[] args) {       
        // reverseString();
        // removeDuplicates();
        // reverseEachWord();
        // charFreqInString();
        // firstNonRepeatedCharInString1();
        // firstNonRepeatedCharInString2();
        replaceCharWithItsOccurrence();
    }
}
