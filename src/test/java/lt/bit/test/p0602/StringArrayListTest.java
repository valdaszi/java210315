package lt.bit.test.p0602;

import lt.bit.p0602.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringArrayListTest {

    @Test
    void test() {
        StringList listas = new StringArrayList(2);

        listas.add("Kuku");
        listas.add("Cho-cho");
        listas.add("abc");
        assertEquals(3, listas.size());

        listas.add(1, "ha-ha-ha");
        assertEquals(4, listas.size());
        assertEquals("Kuku", listas.get(0));
        assertEquals("ha-ha-ha", listas.get(1));
        assertEquals("Cho-cho", listas.get(2));
        assertEquals("abc", listas.get(3));

        listas.remove(0);
        assertEquals(3, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
        assertEquals("Cho-cho", listas.get(1));
        assertEquals("abc", listas.get(2));

        listas.remove(1);
        assertEquals(2, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
        assertEquals("abc", listas.get(1));

        listas.remove(1);
        assertEquals(1, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
    }

    @Test
    void testArrayListString() {
        List<String> listas = new ArrayList<>(2);

        listas.add("Kuku");
        listas.add("Cho-cho");
        listas.add("abc");
        assertEquals(3, listas.size());

        listas.add(1, "ha-ha-ha");
        assertEquals(4, listas.size());
        assertEquals("Kuku", listas.get(0));
        assertEquals("ha-ha-ha", listas.get(1));
        assertEquals("Cho-cho", listas.get(2));
        assertEquals("abc", listas.get(3));

        listas.remove(0);
        assertEquals(3, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
        assertEquals("Cho-cho", listas.get(1));
        assertEquals("abc", listas.get(2));

        listas.remove(1);
        assertEquals(2, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
        assertEquals("abc", listas.get(1));

        listas.remove(1);
        assertEquals(1, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
    }

    @Test
    void testLinkedListString() {
        List<String> listas = new LinkedList<>();

        listas.add("Kuku");
        listas.add("Cho-cho");
        listas.add("abc");
        assertEquals(3, listas.size());

        listas.add(1, "ha-ha-ha");
        assertEquals(4, listas.size());
        assertEquals("Kuku", listas.get(0));
        assertEquals("ha-ha-ha", listas.get(1));
        assertEquals("Cho-cho", listas.get(2));
        assertEquals("abc", listas.get(3));

        listas.remove(0);
        assertEquals(3, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
        assertEquals("Cho-cho", listas.get(1));
        assertEquals("abc", listas.get(2));

        listas.remove(1);
        assertEquals(2, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
        assertEquals("abc", listas.get(1));

        listas.remove(1);
        assertEquals(1, listas.size());
        assertEquals("ha-ha-ha", listas.get(0));
    }
}
