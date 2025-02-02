package OOPS;


public class EncapsulationMain{
		
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation(654, "Vishwa", "Nanded");

		// obj.setId(432);
		// obj.setName("Sunil");
		// obj.setCity("Pune");

		// obj.id = 987;		// private not allowed 
		obj.college = "DYP";	// protected allowed

		System.out.println("Id : "+obj.getId());
		System.out.println("Name : "+obj.getName());
		System.out.println("city : "+obj.getCity());
		System.out.println(obj.college);
	}	

}