package String;


public class StringCompare{

	public static void main(String[] args) {

		String str1 = "welcome";
		String str2 = "welcome";
		String str3 = new String("welcome");
		String str4 = new String("welcome");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));

		System.out.println(str1==str4);
		System.out.println(str1.equals(str4));
	}
}
		