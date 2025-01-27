import java.util.*;

public class StringOperation{

	public static void main(String[] args) {
		

			String str = "welcome";

			String str1 = new String("welcome");

			System.out.println(str.length());
			System.out.println(str==str1);
			// System.out.println(str.equals(str1));
			// System.out.println(str.concat(str1));
			// System.out.println(str+str1);
			// System.out.println(str.trim());
			// System.out.println(str1.length());
			// System.out.println(str1.length());
			// System.out.println(str.charAt(3));
			// System.out.println(str1.contains("el"));
			// System.out.println(str1.replace('l','T'));
			// System.out.println(str.substring(2, 4));	// elc

			String str2 = "asdff@gmail.com";
			String[]arr = str2.split("@");

			System.out.println(arr[0]+"  "+arr[1]);
			System.out.println(Arrays.toString(arr));
			
	}	
}