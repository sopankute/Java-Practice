package com.string;

public class BufferBuilder {

    public static void main(String[] args) {

//        StringBuffer stringBuffer = new StringBuffer("Hello");
//
//        System.out.println(stringBuffer.capacity());    // 16(default) + 5 = 21
//        System.out.println(stringBuffer.length());  // 5

        StringBuilder str = new StringBuilder();
//        StringBuffer str = new StringBuffer();

        Thread t1= new Thread(()->{
            for(int i=0; i<1000; i++){
                str.append("X");
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<1000; i++){
                str.append("Y");
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception ignored){ }

        System.out.println(str.toString().length());
    }
}
