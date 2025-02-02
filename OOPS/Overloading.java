package OOPS;


public class Overloading{
	
	public Overloading(){
		System.out.println("Default Cons.");
	}
	public Overloading(int x, int y){
		this();
		System.out.println("2 Params Cons.");
		System.out.println(x+y);
	}
	public Overloading(int x, int y, double z){
		this(x,y);
		System.out.println("3 Params Cons.");
		System.out.println(x+y+z);
	}


	void add(){
		System.out.println(2+3);
	} 

	void add(int x, int y){			// no of Param different
		System.out.println(x+y);
	}

	void add(int x, double y){		// Data type different
		System.out.println(x+y);
	}
	void add(double x, int y){		// Data type order different
		System.out.println(x+y);	
	}




public static void main(String[] args) {
	
	Overloading obj=new Overloading(3, 5, 6.7);

	obj.add();
	obj.add(2, 3);
	obj.add(2, 3.5);
	obj.add(2.5, 3);

	}

}