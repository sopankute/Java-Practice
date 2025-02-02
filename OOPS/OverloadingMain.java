package OOPS;


public class OverloadingMain{
		
	void main(){
		System.out.println("-");
	}

	void main(String str){
		System.out.println(str);
	}

	void main(String str1, String str2){
		System.out.println(str1+" - "+str2);
	}
	
	public static void main(String[] args) {
	
		OverloadingMain obj=new OverloadingMain();

		obj.main();
		obj.main("str");
		obj.main("str1", "str2");

	}	

}