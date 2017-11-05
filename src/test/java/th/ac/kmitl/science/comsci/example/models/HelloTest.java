package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class HelloTest {

    @Test
    public void getMessageMustBeHello() {
        String result = new Hello().getMessage();

        assert (result.contains("Hello"));
    }

}