package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());

    }
    @Test
    public void should_return_sum() {
        BaseDemo baseDemo = new BaseDemo();
        int num = 12;
        int num1 = 5, num2 = 7;

        int numAns = 11;
        int num3 = 5, num4 = 6;

        assertEquals(num, baseDemo.sum(num1, num2));
        assertEquals(numAns, baseDemo.sum(num3, num4));


    }

}
