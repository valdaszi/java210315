package lt.bit.test.p0527;

import lt.bit.p0527.Uzdavinys.Mokinys;
import lt.bit.p0527.Uzdavinys.Pora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurnyrasTest {

    @Test
    void testMokinysVardas() {
        Mokinys m = new Mokinys("Abc", "Def");
        assertEquals("Abc Def", m.vardas());
    }

    @Test
    void testPoraVardas() {
        Pora pora1 = new Pora(null, null);
        Pora pora2 = new Pora(null, null);
        assertEquals("1 poros laimetoja/as", pora1.vardas());
        assertEquals("2 poros laimetoja/as", pora2.vardas());
    }

    @Test
    void testPoraGame() {
        Pora pora1 = new Pora(new Mokinys("A", "B"), new Mokinys("C", "D"));
        assertEquals("1) A B - C D", pora1.game());

        Pora pora2 = new Pora(new Mokinys("A", "B"), pora1);
        assertEquals("2) A B - 1 poros laimetoja/as", pora2.game());

        Pora pora3 = new Pora(pora2, new Mokinys("A", "B"));
        assertEquals("3) 2 poros laimetoja/as - A B", pora3.game());

        Pora pora4 = new Pora(pora1, pora2);
        assertEquals("4) 1 poros laimetoja/as - 2 poros laimetoja/as", pora4.game());
    }
}
