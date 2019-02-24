package CreateStream.StreamOperations;

import java.util.Arrays;
import java.util.List;

public class StreamFind {
    public StreamFind() {
    }
    //As the name suggests, the findAny() method allows you to find any element from a Stream.
    // Use it when you are looking for an element without paying an attention to the encounter order:
    //The method returns an Optional instance which is empty if the Stream is empty:

    public static List<String> strings(){

        List<String> list = Arrays.asList("A", "B", "C", "D");

        return list;

    }
}
