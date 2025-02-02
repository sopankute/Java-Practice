package Threads;
import java.util.Arrays;

public class MutabilityString{

	public static void main(String[] args) {
		
		// mutable = can change
		int[] arr = {43, 66, 87, 23, 43, 86, 93, 23, 63, 54, 37, 23};
		System.out.println(Arrays.toString(arr));

/*		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
		System.out.println("-------------");
		// immutable = can't change

		String str = new String("welcome");

		System.out.println(str);
		str.concat("to Home");
		System.out.println(str);
		
		System.out.println();
		
		String str1 = str.concat(" to Jorassic Park");
		System.out.println(str1);

		System.out.println("-------------");
		String str3 = "welcome";

		System.out.println(str3);
		str3.concat("to Home");
		System.out.println(str3);
		
		System.out.println();
		
		String str4 = str3.concat(" to Jorassic Park");
		System.out.println(str4);

*/

		StringBuffer str3 = new StringBuffer("welcome");
		str3.append(" to Home");
		System.out.println(str3);

		StringBuilder str4 = new StringBuilder("welcome");
		str4.append(" to Home");
		System.out.println(str4);

	}
}