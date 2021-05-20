package lt.bit.test;

import lt.bit.p0520.ManoDidelisSkaicius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManoDidelisSkaiciusTest {

    @Test
    void testConstructorAndToString() {
        ManoDidelisSkaicius manoDidelisSkaicius = new ManoDidelisSkaicius(1234567);
        String string = manoDidelisSkaicius.toString();
        assertEquals("1234567", string);

        assertEquals("876543210", new ManoDidelisSkaicius(876543210).toString());
        assertEquals("0", new ManoDidelisSkaicius(0).toString());
    }

    @Test
    void testAdd() {
        ManoDidelisSkaicius s1 = new ManoDidelisSkaicius(1234567);
        ManoDidelisSkaicius s2 = new ManoDidelisSkaicius(33);
        assertEquals("1234600", s1.add(s2));
    }

    @Test
    void testMultiply() {
        assertEquals("20480", new ManoDidelisSkaicius(10240).multiply(2));
        assertEquals("409600", new ManoDidelisSkaicius(10240).multiply(40));
    }
}
