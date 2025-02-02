package OOPS;


public class Encapsulation{
	
	private int id;
	private String name;
	private String city;
	protected String college;

	public Encapsulation(int id, String name, String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return city;
	}
}