package Java_8.Practice;

import java.util.Arrays;
import java.util.List;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}

public class StreamDemo3 {
    public static void main(String[] args) {

        User u1 = new User("Charlie", 39);
        User u2= new User("Bravo", 46);
        User u3= new User("Mike", 38);
        User u4= new User("Alpha", 25);
        User u5= new User("Delta", 74);
        User u6= new User("Quebec", 92);

        List<User> list = Arrays.asList(u1, u2, u3, u4, u5, u6);

        list.stream().filter(u-> u.age>40 && u.name.startsWith("Q"))
                     .forEach(u->System.out.println(u.name+" "));

    }
}
