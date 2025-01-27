package Java_8;

public interface Test3 {

    public static void main(String[] args) {
        
        InnerEmployee emp = new InnerEmployee(){    // Ananymous class

            int x = 10;     // Instance variable
            @Override
            public String sayHi() {
                int x = 20;
                System.out.println("Instance variable : "+this.x);  // 10
                System.out.println(x);      // 20
               return "sayHi()";
            }
            @Override
            public String sayHello() {
                return "sayHello";
            }
        };
        System.out.println(emp.sayHi() +"\n"+emp.sayHello());

        // Lambda Expression
        Employee emp1 = ()->{
            int x = 10;         // Local Variable
            System.out.println("Local Variable "+x);
            return "Software Engineer";
        };
        System.out.println(emp1.getName());
    }
}
