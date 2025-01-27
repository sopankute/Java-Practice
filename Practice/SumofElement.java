package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumofElement {
    
    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(12,54,76,14,7,21,76,43,87);

        // Optional<Integer> sum = list.stream().reduce((a,b) ->a+b);
        // System.out.println(sum.get());

        double x =list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(x);
    }

}
