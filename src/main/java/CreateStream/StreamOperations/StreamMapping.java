package CreateStream.StreamOperations;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapping {
    // To convert elements of a Stream by applying a special function to them and to collect these new elements into a Stream,
    // we can use the map() method:

    public static void main(String[] args) {

        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");

        // created a Stream of path
        Stream<Path> stream = uris.stream().map(uri -> Paths.get(uri));
        stream.forEach(val -> System.out.println(val));
    }
}
