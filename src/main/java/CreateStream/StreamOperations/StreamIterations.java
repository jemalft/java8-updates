package CreateStream.StreamOperations;

import java.util.HashSet;
import java.util.Set;

public class StreamIterations {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("jemal");
        set.add("Ehan");
        set.add("Fer");

        for (String string : set) {
            if (string.contains("jemal")) {
                System.out.println("the answer is correct");
            }
        }


       boolean isExist =  set.stream().anyMatch(ele ->ele.contains("jemal2"));
        System.out.println("Is exist = : " + isExist);
    }
}
