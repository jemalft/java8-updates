package CreateStream.StreamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollecting {

    //The reduction can also be provided by the collect() method of type Stream.
    // This operation is very handy in case of converting a stream to a Collection or a Map and representing a stream in form of a single string.
    // There is a utility class Collectors which provide a solution for almost all typical collecting operations.
    // For some, not trivial tasks, a custom Collector can be created.
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("ODerek");
        list.add("OChange");

// This code uses the terminal collect() operation to reduce a Stream<String> to the List<String>.

        List<String> resultList
                = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        resultList.add("jemal");

        resultList.forEach(val ->System.out.println(resultList));


    }
}
