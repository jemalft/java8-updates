package CreateStream.StreamOperations;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationsBasic {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        list.add(122232L);
        list.add(123L);
        list.add(345L);
        list.add(123L);
        list.add(983945L);

       // list.forEach(val ->System.out.println(val));

        long count = list.stream().distinct().count();

        list.stream().distinct().forEach(val -> System.out.println(val));

        System.out.println(count);



        //distinct will return a stream of unique long values ---> intermediate operation
        //count will return stream's size --> terminal operation
    }
}
