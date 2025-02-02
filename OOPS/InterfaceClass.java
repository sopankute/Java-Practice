package OOPS;
// import java.util.*;

interface MyInterface{

	int length = 10;
	String str = "Rose";

	// int y;					// need to Initialize 
	// private int x =11;	// not allowed

	void display();
	
	default void print(){
		System.out.println("This is default method");
		show();
	}

	static void show(){
		System.out.println("it static method");
	}

}

public class InterfaceClass implements MyInterface{
	@Override
	public void display(){
		System.out.println("implemented method");
	}

	void disp1(){
		System.out.println("this is InterfaceClass method");
	}

	public static void main(String[] args) {

		// InterfaceClass obj=new InterfaceClass();
		// System.out.println(length);
		// System.out.println(str);

		// // obj.length = 20;	// error: cannot assign a value to static final

		// obj.display();
		// obj.print();
		// // show();			// error: cannot find symbol
		// MyInterface.show();


		MyInterface obj=new InterfaceClass();

		// obj.length = 20;	// error: cannot assign a value to static final

		obj.display();
		obj.print();
		// show();			// error: cannot find symbol
		MyInterface.show();
		// obj.disp1();		// error: cannot find symbol
	}
}