package com.string;

class SharedResource{

    private  boolean flag = false;

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public boolean getFlag(){
        return  flag;
    }
}

public class VisibilityProb {

    public static void main(String[] args) {

        SharedResource sharedResourceObj = new SharedResource();
        // create 2 threads

        new Thread(()->{
            System.out.println("Thread-1 started");
            try {
                Thread.sleep(10000);
                sharedResourceObj.setFlag(true);
                System.out.println("Flag value set by Thread-1");
                System.out.println("Thread-1 completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            System.out.println("Thread-2 started");

            while (!sharedResourceObj.getFlag()){
                // execute until flag = true
                System.out.println("Thread-2 running...");
            }
            System.out.println("Thread-2 completed");
        }).start();
    }

}
