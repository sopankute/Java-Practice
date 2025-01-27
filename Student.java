

public class Student{
	
	String stu_name;		// heap

	public Student(){
		// System.out.println("Default");	
	}

	public Student(String name){
		this();
		System.out.println(name);
	}

	public static void main(String[] args) {
			
		// Student obj = new Student();
		// Student obj1 = new Student("yuiop");

		// obj.stu_name = "xyz";

		// System.out.println(obj.stu_name);


		Student s1 = new Student();		// heap
		Student s2 = new Student();

		System.out.println(s1==s2);		// False

		Class c1 = s1.getClass();
		Class c2 = s2.getClass();		

		System.out.println(c1==c2);		// True
		System.out.println();
		// Runtime r = Runtime.getRuntime();
		// System.out.println(r.getClass());
		// System.out.println(r.availableProcessors());
		// System.out.println(r.maxMemory());
		// System.out.println(r.totalMemory());
		// System.out.println(Runtime.version());
		// System.out.println(r.freeMemory());


	}	
}