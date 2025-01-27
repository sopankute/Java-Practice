package Practice;

public class ReverseString {

    public static void main(String[] args) {
        
/*
        String str1 = "Vyankatesh";
        char[] arr = str1.toCharArray();
        String revString1 = "";
        String revString2 = "";

        // 1 - Using '+' and charAt()
        for (int i = str1.length()-1; i>=0 ; i--) {
            revString1 += str1.charAt(i);
            revString2 += arr[i];
        }

        // 2 - Using char[]
        // char[] arr = str1.toCharArray();
        // for (int i=arr.length-1; i>=0 ; i--) {
        //     revString = revString + arr[i];
        // }        

        // 3 - StringBuffer
        StringBuffer sb = new StringBuffer(str1);


        System.out.println("Reserve String1 : "+revString1);
        System.out.println("Reserve String2 : "+revString2);
        System.out.println("Reserve String3 : "+sb.reverse());

*/

        String str5 = "selenium automation testing";
        String[] arr2 = str5.split(" ");
        String str6="";
        for (int i = arr2.length-1; i>=0 ; i--) {
            // revString1 += str5.charAt(i);
            str6 = str6 + arr2[i];
            str6 = str6 + " ";
            // System.out.println(arr2[i]);
        }

        System.out.println(" "+str6);   // testingautomationselenium
    }
}
