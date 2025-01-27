package BuilderDesignPattern;

public class Test {
    public static void main(String[] args) {
        
       User user = new User.UserBuilder().setUserId("8789").setUserName("Sunil").setUserCity("Pune").buildUser();

       System.out.println(user);
    }
}
