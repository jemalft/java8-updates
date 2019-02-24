package CreateStream.StreamOperations;

import java.util.ArrayList;

public class StreamMatching {

   // Stream API gives a handy set of instruments to validate elements of a sequence according to some predicate.
   // To do this one of the following methods can be used: anyMatch(), allMatch(), noneMatch().
   // Their names are self-explaining. Those are terminal operations which return a boolean.

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("ODerek");
        list.add("OChange");


        boolean isValid = list.stream().anyMatch(element -> element.contains("j")); // true
        System.out.println(isValid);


        boolean isValidOne = list.stream().allMatch(element -> element.contains("O")); // true
        System.out.println(isValidOne);

        boolean isValidTwo = list.stream().noneMatch(element -> element.contains("J")); // true
        System.out.println(isValidTwo);




    }
}
