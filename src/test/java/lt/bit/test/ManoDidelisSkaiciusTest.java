package lt.bit.test;

import lt.bit.p0520.ManoDidelisSkaicius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
        assertEquals("1234600", s1.add(s2).toString());
        assertEquals("1000", new ManoDidelisSkaicius(999).add(new ManoDidelisSkaicius(1)).toString());
    }

    @Test
    void testMultiply() {
        assertEquals("20480", new ManoDidelisSkaicius(10240).multiply(2).toString());
        assertEquals("409600", new ManoDidelisSkaicius(10240).multiply(40).toString());
    }

    @Test
    void testDoubleEquals() {
        double d1 = 100.5;
        double d2 = 10.05 * 10; // 100.5
        assertEquals(d1, d2);

        String v = "ab";
    }

    @Test
    void testStringEquals() {
        String s = "ab";
        String s1 = s.concat("c"); // s + "c"
        String s2 = "a" + "b" + "c";
        assertEquals(s1, s2);
        // if (s1 != s2) fail(s1 + " != " + s2);
        if (!s1.equals(s2)) fail(s1 + " != " + s2);
    }

    @Test
    void testManoDidelsSkaiciusEquals() {
        ManoDidelisSkaicius s1 = new ManoDidelisSkaicius(1234567);
        ManoDidelisSkaicius s2 = s1;
        if (!s1.equals(s2)) fail(s1 + " != " + s2);

        s2 = new ManoDidelisSkaicius(1234567);
        if (!s1.equals(s2)) fail(s1 + " != " + s2);

        assertEquals(s1, s2); // if (s1 == s2) { OK } else { FAIL }
    }
}
