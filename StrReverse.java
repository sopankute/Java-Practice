


public class StrReverse{

public static void main(String[] args) {
	
	String str = "welcome";
	int n = str.length();

	// Approach 1

	String rev = "";
	for(int i=n-1; i>=0; i--){
		rev = rev+str.charAt(i);
	}
	System.out.println(rev);

	System.out.println();
	
	// Approach 2
	char[] str1 = str.toCharArray();
	String rev1="";

	for(int i=n-1; i>=0; i--){
		rev1 = rev1+str1[i];
	}
	System.out.println(rev);

	System.out.println();

	//  Approach 3
	for(int i=n-1; i>=0; i--){
		System.out.print(str.charAt(i));
	}

	System.out.println();

	// Approach 4

	StringBuffer str3 = new StringBuffer("welcome");
	System.out.println(str3.reverse());

	System.out.println();

	StringBuilder str4 = new StringBuilder("welcome");
	System.out.println(str4.reverse());


}	

}