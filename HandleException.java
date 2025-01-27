
import java.util.*;

public class HandleException{

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter numeric value : ");
		int num = sc.nextInt();
		int result = 0;
		try{
			 result = 45/num;
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("ArithmeticException | Invalid data");
		}
		catch(Exception e){
			System.out.println("Exception | Invalid data");
		}

		System.out.println("result is : "+result);

	}
}