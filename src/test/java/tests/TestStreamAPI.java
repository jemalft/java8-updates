package tests;

import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TestStreamAPI {

    @Test

    public void tryTest(){


        assertThat("".isEmpty()).isTrue();

    }
}
