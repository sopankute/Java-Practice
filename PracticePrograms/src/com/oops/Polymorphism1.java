package com.oops;

class MyTest1{

    public MyTest1(){
        System.out.println("MyTest1.MyTest1() Constructor");
    }

    public void show(){
        System.out.println("MyTest1.show");
    }
}

class ChildTest extends MyTest1{
    public ChildTest(){
        System.out.println("ChildTest.ChildTest() Constructor");
    }

    public void show(int a) {
        System.out.println("ChildTest.show : "+a);
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        ChildTest obj1 = new ChildTest();
        obj1.show();         // MyTest1.show
//      obj1.show(46);       // ChildTest.show : 46

        MyTest1 obj2 = new ChildTest();
//        obj2.show(39);           // Error: method show in class com.oops.MyTest1 cannot be applied to given types;
        obj2.show();            // MyTest1.show
    }
}
