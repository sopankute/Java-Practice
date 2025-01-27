package IteratorDesignPattern;

public class Test {
    public static void main(String[] args) {
        
        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User(423,"Namdev"));
        userManagement.addUser(new User(423,"Sunil"));
        userManagement.addUser(new User(423,"Mahavir"));
        userManagement.addUser(new User(423,"Sopan"));
        userManagement.addUser(new User(423,"Vishwajit"));

        MyIterator itr = userManagement.getIterater();

        while (itr.hasNext()) {
            User user = (User) itr.next();
            // System.out.println(user.getUserName());
            System.out.println(user);
        }

    }
}
