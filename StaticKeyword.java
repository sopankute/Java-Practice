

public class StaticKeyword{

	static int id;
	static String city;
	String name;

	static{
		id = 876;
		city = "Pune";
		System.out.println("static blocks");
	}

	StaticKeyword(){
		System.out.println("default constructor");
	}

	static void meth1(){
		System.out.println("static meth1() | "+id+"  - "+city);	// only static
	}


	void meth2(){
		System.out.println("non-static meth2() | "+id+" - "+city+" - "+name);	// allowed
	}

	public static void main(String[] args) {

		System.out.println("main method");
		StaticKeyword obj = new StaticKeyword();

		// System.out.println(id);
		// System.out.println(city);
		// System.out.println(name);		// not allowed

		meth1();
		// meth2();				// not allowed
		obj.meth2();

	}

}

// static blocks
// main method
// default constructor 
// static meth1()
// non-static meth2()
