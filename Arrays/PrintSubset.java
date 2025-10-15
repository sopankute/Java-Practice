package Arrays;

public class PrintSubset {
    public static void main(String[] args) {
        
        // 2, 6, 3, 5, 9

        int arr[] = {2,	4, 7, 8, 9};

        for(int i=0; i<arr.length; i++){

            int sum = 0;
            for(int j=0; j<=i; j++){
                sum += arr[j];
                System.out.print("  "+arr[j]);

            }
            System.out.println("\t\t\t"+sum);
        }

    }
}

// 2	4	7	8	9


// 2					=	2

// 2	4				=	6	

// 2	4	7			=	13

// 2	4	7	8		=	21

// 2	4	7	8	9	=	30




