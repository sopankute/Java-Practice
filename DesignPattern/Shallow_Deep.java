

public class Shallow_Deep implements Cloneable{
    
    String name;
    int age;

    public Shallow_Deep(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Person{name= "+name+", age= "+age+"}";
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        
        Shallow_Deep original = new Shallow_Deep("Alice", 30);

        try {
            Shallow_Deep cloned = (Shallow_Deep) original.clone();
            System.out.println(original);
            System.out.println(cloned);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





