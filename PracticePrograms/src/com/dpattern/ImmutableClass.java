package com.dpattern;

import java.util.ArrayList;
import java.util.List;

 class MyImmutableClass{

    private final String name;
    private final List<Object> petNameList;

    public MyImmutableClass(String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
//        return petNameList;                     // [CAT, DOG, COW, Elephant] - 2108055885
        return new ArrayList<>(petNameList);      // [CAT, DOG, COW] - 66093668
    }
}

public class ImmutableClass {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("CAT");
        list.add("DOG");
        list.add("COW");

        MyImmutableClass obj = new MyImmutableClass("MyName", list);
        System.out.println(obj);

        obj.getPetNameList().add("Elephant");
        System.out.println(obj);

        System.out.println(obj.getPetNameList());
        System.out.println(obj.getPetNameList().hashCode());
    }
}
