package Practice;

public class StringToIntDemo {

    public void show(){
        show1();
        this.show2();
    }
    public static void show1(){
        System.out.println("StringToIntDemo.show()1");
    }
    public void show2(){
        System.out.println("StringToIntDemo.show()2");
    }

    public void traverse(){

        for(int i=0; i<50; i++){
            if(i%3==0 && i%5==0){
                continue;                
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        StringToIntDemo obj = new StringToIntDemo();
        // obj.show();
        obj.traverse();


        // // String str = "India";    // java.lang.NumberFormatException
        // String str = "20";    

        // int x = Integer.parseInt(str);
        // System.out.println(x);

    }
}
