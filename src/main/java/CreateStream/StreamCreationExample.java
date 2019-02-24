package CreateStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

 //  A stream() default method is added to the Collection interface and allows creating a Stream<T>
 //  using any collection as an element source:
 //  Stream of List,Set,Array and collections etc ...

    public static void main(String[] args) {

        // Example stream() method using array

        String[] str = {"je","mf","mo","fer","eh"};

        Stream<String> streamArray = Arrays.stream(str);


        // Example stream() using any collections

        List<String> list = new ArrayList<>();
        list.add("je");
        list.add("fer");

        Stream<String> streamList = list.stream();

        // Multi-threading using Streams
        // Stream API also simplifies multithreading by providing the parallelStream() method
        // that runs operations over stream’s elements in parallel mode

     //   list.parallelStream().forEach(element -> doWork(element));



    }


}
