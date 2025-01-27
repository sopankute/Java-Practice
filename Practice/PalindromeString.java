package Practice;

public class PalindromeString {
    public static void main(String[] args) {

        String str1 = "MADAM";
        String str2 = "";
        char[] arr = str1.toCharArray();
        String str3 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
            str3 += arr[i];
        }

        if (str1.equals(str2))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");

        if (str1.equals(str3))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");
    }
}
