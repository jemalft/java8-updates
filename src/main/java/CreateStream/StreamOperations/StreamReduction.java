package CreateStream.StreamOperations;

import java.util.Arrays;
import java.util.List;

public class StreamReduction {

    //Stream API allows reducing a sequence of elements to some value according to a specified function with the help of the reduce() method of the type Stream.
    // This method takes two parameters: first – start value, second – an accumulator function.
    //Imagine that you have a List<Integer> and you want to have a sum of all these elements
    // and some initial Integer (in this example 23). So, you can run the following code and result will be 26 (23 + 1 + 1 + 1).
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(2, 3, 2);

        Integer integer = integers.stream().reduce(4,(a,b) -> a*b); // 4(2*3*2) 48
        System.out.println(integer);

        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b); //23(2+3+2)
        System.out.println(reduced);


    }
}
