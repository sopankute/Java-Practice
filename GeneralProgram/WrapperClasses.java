import java.util.*;

public class WrapperClasses{
	
	public void method(){

		String number = "0987654";
		int num = Integer.parseInt(number);
		System.out.println(num+=num);

		String number1 = "0987.654";
		System.out.println(Double.parseDouble(number1));

		String str = "false";
		String str1 = "true";
		String str2 = "1";
		System.out.println(Boolean.parseBoolean(str));
		System.out.println(Boolean.parseBoolean(str1));
		System.out.println(Boolean.parseBoolean(str2));


		int i=14;
		double d = 76.890780;
		char c = 'j';
		boolean bool = true;

		System.out.println(String.valueOf(i));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bool));
	}

	public static void main(String[] args) {
		
		WrapperClasses obj=new WrapperClasses();
		obj.method();
	}
}
