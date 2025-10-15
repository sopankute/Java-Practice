package com.dpattern;

import java.io.*;
import java.lang.reflect.Constructor;

// 1. Eager Initialization
class EagerSingletonClass{

    private static EagerSingletonClass instance = new EagerSingletonClass();    // create, when class loaded

    private EagerSingletonClass(){ // restrict object initialization
        if(instance != null){
            throw new RuntimeException("You are trying break Singleton Design pattern");
        }
    }

    public static EagerSingletonClass getEagerInstance(){
        return instance;
    }
}

class LazySingletonClass implements Serializable, Cloneable {

    private static LazySingletonClass instance;

    private LazySingletonClass(){
        if(instance != null){
            throw new RuntimeException("You are trying break Singleton Design pattern");
        }
    }

    public static LazySingletonClass getLazyInstance(){
        if(instance == null){
            instance = new LazySingletonClass();
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
        return this;
    }

}

class SynchronizedSingletonClass{
    private static SynchronizedSingletonClass instance;

    private SynchronizedSingletonClass(){
        if(instance != null){
            throw new RuntimeException("You are trying break Singleton Design pattern");
        }
    }

    public static synchronized SynchronizedSingletonClass getInstance(){
        if(instance == null){
            instance = new SynchronizedSingletonClass();
        }
        return instance;
    }
}

class DoubleCheckSingletonClass{

    private static volatile DoubleCheckSingletonClass instance = null;

    private DoubleCheckSingletonClass(){ }

    public static DoubleCheckSingletonClass getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingletonClass.class){
                if(instance == null){
                    instance = new DoubleCheckSingletonClass();
                }
            }
        }
        return instance;
    }
}

class BillPughSingletonClass{

    private BillPughSingletonClass(){ }

    private static class InnerSingletonHelper{
        private static final BillPughSingletonClass instance = new BillPughSingletonClass();
    }

    public static BillPughSingletonClass getInstance(){
        return InnerSingletonHelper.instance;
    }
}

enum EnumTypeSingleton{
    INSTANCE
}


public class SingletonDesignPattern {
    public static void main(String[] args) throws Exception, CloneNotSupportedException{

        // Eager Initialization
        EagerSingletonClass egarObj1 = EagerSingletonClass.getEagerInstance();
        EagerSingletonClass egarObj2 = EagerSingletonClass.getEagerInstance();
//        System.out.println(egarObj1.hashCode());
//        System.out.println(egarObj2.hashCode());

        // Lazy Initialization
        LazySingletonClass lazyObj1 = LazySingletonClass.getLazyInstance();
        LazySingletonClass lazyObj2 = LazySingletonClass.getLazyInstance();
//        System.out.println(lazyObj1.hashCode());
//        System.out.println(lazyObj2.hashCode());
/*
        new Thread(()->{
            LazySingletonClass lazyObj3 = LazySingletonClass.getLazyInstance();
            System.out.println(lazyObj3.hashCode());    // 496849364
            System.out.println("called "+Thread.currentThread().getName()); // Thread-1
        }).start();

        new Thread(()->{
            LazySingletonClass lazyObj4 = LazySingletonClass.getLazyInstance();
            System.out.println(lazyObj4.hashCode());    // 390317110
            System.out.println("called "+Thread.currentThread().getName()); // Thread-0
        }).start();

*/
        // Synchronized Method
     /*   new Thread(()->{
            SynchronizedSingletonClass synchronizedObj1 = SynchronizedSingletonClass.getInstance();
            System.out.println(synchronizedObj1.hashCode());
            System.out.println("called "+Thread.currentThread().getName());
        }).start();

        new Thread(()->{
            SynchronizedSingletonClass synchronizedObj2 = SynchronizedSingletonClass.getInstance();
            System.out.println(synchronizedObj2.hashCode());
            System.out.println("called "+Thread.currentThread().getName());
        }).start();*/

        // Double Locking (Synchronized block)
       /* new Thread(()->{
            DoubleCheckSingletonClass doubleCheckObj1 = DoubleCheckSingletonClass.getInstance();
            System.out.println(doubleCheckObj1.hashCode());     // 2012420965
            System.out.println("called "+Thread.currentThread().getName());     // Thread-1
        }).start();

        new Thread(()->{
            DoubleCheckSingletonClass doubleCheckObj2 = DoubleCheckSingletonClass.getInstance();
            System.out.println(doubleCheckObj2.hashCode());     // 2012420965
            System.out.println("called "+Thread.currentThread().getName());     // Thread-0
        }).start();
*/

        // Bill Pugh Solution
/*
        BillPughSingletonClass billPughObj1 = BillPughSingletonClass.getInstance();
        System.out.println(billPughObj1.hashCode());    // 1867083167
        BillPughSingletonClass billPughObj2 = BillPughSingletonClass.getInstance();
        System.out.println(billPughObj2.hashCode());    // 1867083167
*/

        // Enum
//        System.out.println(EnumTypeSingleton.INSTANCE.hashCode());  // 1531448569
//        System.out.println(EnumTypeSingleton.INSTANCE.hashCode());  // 1531448569

        // Ways to Break Singleton Design Pattern
        // 1. Reflection APIs
/*
        EagerSingletonClass obj1 = EagerSingletonClass.getEagerInstance();
        System.out.println(obj1.hashCode());    // 1072408673

        Constructor<EagerSingletonClass> constructor = EagerSingletonClass.class.getDeclaredConstructor();
        constructor.setAccessible(true);        // changing Accessibility
        EagerSingletonClass obj2 = constructor.newInstance();
        System.out.println(obj2.hashCode());    // 1531448569
*/


        // 2. Deserialization
        LazySingletonClass lazyObj3 = LazySingletonClass.getLazyInstance();
//        System.out.println(lazyObj3.hashCode());    // 1072408673
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(lazyObj3);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        LazySingletonClass lazyObj4 = (LazySingletonClass)ois.readObject();
//        System.out.println(lazyObj4.hashCode());    // 1942406066

        // 3. Cloning
        LazySingletonClass lazyObj5 = LazySingletonClass.getLazyInstance();
        System.out.println(lazyObj5.hashCode());    // 517380410

        LazySingletonClass lazyObj6 = (LazySingletonClass)lazyObj5.clone();
        System.out.println(lazyObj6.hashCode());    // 1213415012

    }
}
