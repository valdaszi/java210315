package lt.bit.test.p0524;

import lt.bit.p0524.Zmogus;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ZmogusTest {

    @Test
    void testEquals() {
        assertEquals(new Zmogus("A", "a"), new Zmogus("A", "a"));
        assertEquals(new Zmogus("ABC", "aaa"), new Zmogus("abc", "AAA"));
        assertEquals(new Zmogus("ABC", ""), new Zmogus("abc", ""));
        assertEquals(new Zmogus("", "aaa"), new Zmogus("", "AAA"));
        assertEquals(Zmogus.createFromNameAndEmail(" A", "a "), new Zmogus("A ", " a"));
    }

    @Test
    void testEqualsAdvSpaces() {
        assertEquals(new Zmogus("ABC DEF", "a"), new Zmogus("abc   def", "a"));
    }

    @Test
    void testEqualsAdvNull() {
        assertEquals(new Zmogus("ABC", null), new Zmogus("abc", null));
        assertEquals(new Zmogus("ABC", null), new Zmogus("abc", ""));
        assertEquals(new Zmogus("ABC", ""), new Zmogus("abc", null));

        assertEquals(new Zmogus(null, "aaa"), new Zmogus(null, "AAA"));
        assertEquals(new Zmogus(null, "aaa"), new Zmogus("", "AAA"));
        assertEquals(new Zmogus("", "aaa"), new Zmogus(null, "AAA"));
    }

    @Test
    void testNotEquals() {
        assertNotEquals(new Zmogus("A", "a"), new Zmogus("A1", "a"));
        assertNotEquals(new Zmogus("A", "a1"), new Zmogus("A", "a"));
        assertNotEquals(new Zmogus("A1", "a1"), new Zmogus("A2", "a2"));
        assertNotEquals(new Zmogus(null, "a1"), new Zmogus("A2", "a2"));
        assertNotEquals(new Zmogus("", "a1"), new Zmogus("A2", "a2"));
        assertNotEquals(new Zmogus("A1", null), new Zmogus("A2", "a2"));
        assertNotEquals(new Zmogus("A1", ""), new Zmogus("A2", "a2"));
        assertNotEquals(new Zmogus("A1", "a1"), new Zmogus(null, "a2"));
        assertNotEquals(new Zmogus("A1", "a1"), new Zmogus("", "a2"));
        assertNotEquals(new Zmogus("A1", "a1"), new Zmogus("A2", null));
        assertNotEquals(new Zmogus("A1", "a1"), new Zmogus("A2", ""));
    }

    @Test
    void testZogusAge() {
        Zmogus z = new Zmogus("A", "a", LocalDate.of(2000, 1, 15));

        assertEquals(9, z.age(LocalDate.of(2010, 1, 14)));
        assertEquals(10, z.age(LocalDate.of(2010, 1, 15)));
    }
}
