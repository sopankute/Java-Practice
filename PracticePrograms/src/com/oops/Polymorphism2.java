package com.oops;

class MyTest2{
    public void show(String str){
        System.out.println("MyTest2.show | obj = " + str);
    }
}

class ChildTest2 extends MyTest2{
    public void show(Object obj){
        System.out.println("ChildTest2.show | str = " + obj);
    }
//    public void show(String str){
//        System.out.println("obj = " + str);
//    }
}

public class Polymorphism2 {
    public static void main(String[] args) {

        MyTest2 obj1 = new MyTest2();
        obj1.show("Hello");             // MyTest2.show | obj = Hello

        ChildTest2 obj2 = new ChildTest2();
        obj2.show("Rohit");             // ChildTest2.show | str = Rohit

        MyTest2 obj3 = new ChildTest2();
        obj3.show("How are you?");      // MyTest2.show | obj = How are you?

        System.out.println("Polymorphism2.main");

    }
}
