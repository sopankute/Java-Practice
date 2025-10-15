package com.collection;

import java.util.ArrayList;
import java.util.Objects;

public class CustomArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {

        if(this.contains(o)){
            return true;
        }else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        ArrayList obj = new CustomArrayList();
        obj.add(3);
        obj.add(3);
        obj.add(4);
        obj.add(4);
        obj.add(3);
        obj.add(7);
        System.out.println(obj);
    }
}
