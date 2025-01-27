package InnerClasses;

public class AccessOutermember {

    public static final int x = 10;
    private int y = 11;
    protected int z = 12;

    int p = 101;

    class InnerClass{
        int p = 102;
        public void innerMeth(){
            int p = 103;

            // System.out.println("public static final : "+x);
            // System.out.println("private : "+y);
            // System.out.println("protected : "+z);

            System.out.println("--------------------");
            System.out.println(p);
            System.out.println(this.p);
            System.out.println(AccessOutermember.this.p);
        }
    }



    public static void main(String[] args) {

        new AccessOutermember().new InnerClass().innerMeth();
    }

}
