package CreateStream.StreamOperations;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFiltering {
// Filter() --> allow us to pick stream of elements which satisfy a predicate


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("IjustBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");




    Stream<String> stream = list.stream().filter(ele -> ele.contains("I")); // Created Stream of filtered char
    stream.forEach(val -> System.out.println(val)); // Action

    boolean str = stream.anyMatch(ele ->ele.contains("J")); //predicate

    System.out.println(str);


}


}
