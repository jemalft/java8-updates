package Optional;


import org.testng.annotations.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PersonRepositoryUnitTest {

    PersonRepository personRepository = new PersonRepository();

    @Test
    public void whenIdIsNull_thenExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class,
                () ->
                        Optional
                                .ofNullable(personRepository.findNameById(null))
                                .orElseThrow(IllegalArgumentException::new));

        System.out.println(personRepository.findNameById(null));
    }

    @Test
    public void whenIdIsNonNull_thenNoExceptionIsThrown() {
        assertAll(
                () ->
                        Optional
                                .ofNullable(personRepository.findNameById("id"))
                                .orElseThrow(RuntimeException::new));

        System.out.println(personRepository.findNameById("id"));  // return name

    }

    @Test
    public void whenIdNonNull_thenReturnsNameUpperCase() {
        String name = Optional
                .ofNullable(personRepository.findNameById("id"))
                .map(String::toUpperCase)
                .orElseThrow(RuntimeException::new);

        assertEquals("USERNAME", name);
    }

    @Test
    public void whenIdNonNull_thenReturnNameUppercaseCustom(){
        String name = Optional
                .ofNullable(personRepository.findNameById("xxx"))
                .map(String::toUpperCase)
                .orElseThrow(RuntimeException::new);

        assertEquals("USERNAME", name);

    }

}