package tests;

import org.testng.annotations.Test;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.testng.Assert.fail;

public class StreamFindTest {

    @Test(expectedExceptions = IllegalStateException.class)
    public void givenStream_whenStreamUsedTwice_thenThrowException() {
        Stream<String> stringStream = Stream.of("A", "B", "C", "D");
        Optional<String> result1 = stringStream.findAny();
        System.out.println(result1.get());
        Optional<String> result2 = stringStream.findFirst();
        System.out.println(result2.get());
    }

    @Test
    public void givenStream_whenUsingSupplier_thenNoExceptionIsThrown() {
        try {
            Supplier<Stream<String>> streamSupplier = () -> Stream.of("A", "B", "C", "D");
            Optional<String> result1 = streamSupplier.get().findAny();
            System.out.println(result1.get());
            Optional<String> result2 = streamSupplier.get().findFirst();
            System.out.println(result2.get());
        } catch (IllegalStateException e) {
            fail();
        }
    }
}