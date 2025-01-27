import java.util.*;

public class Test{

	public static void main(String[] args) {
		
		int[] arr = {43, 66, 87, 23, 43, 86, 93, 23, 63, 54, 37, 23};

		System.out.println(Arrays.toString(arr));
		System.out.println();
		for(int i=arr.length-1; i>=0; i--){

			System.out.print(" "+arr[i]);
		}


		// approach 1

		Arrays.sort(arr);

		System.out.println("Sorted Arrays : "+Arrays.toString(arr));

		System.out.println("Max : "+arr[arr.length-1]);

		System.out.println("Min : "+arr[0]);

		// int element = 23;
		// int count = 0;
		// for(int i=0; i<arr.length; i++){
		// 	if(arr[i]==element){
		// 		count++;
		// 		System.out.println(i+" - "+arr[i]);
		// 	}
		// }
		// System.out.println(element+" is present "+count+" times.");


		// for(int e : arr){
		// 	if(e==element){
		// 		System.out.println(e);
		// 		break;
		// 	}
		// }


	}
}