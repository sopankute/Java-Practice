package JavaPrograms;

public class PrintAlphabets {
    public static void main(String[] args) {
        
// 5. Write a program to print all alphabets from a to z

        System.out.println("Printing Alphabets from a to z in order: ");

        for(int i=97; i<=122; i++){
            System.out.print("  "+(char)i);
        }

// 6. Write a program to print reverse alphabets from Z to A

        System.out.println("\nPrinting Alphabets from Z to A in Reverse order: ");
        for(int i=90; i>=65; i--){
            System.out.print("  "+(char)i);
        }

    }
}
