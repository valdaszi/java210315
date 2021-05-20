import lt.bit.intro.Uzdavinys2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Uzdavinys2Test {

    @Test
    void testPositive() {
        assertEquals(15.5, Uzdavinys2.apvalinti(15.545678, 1), 0.01);
        assertEquals(15.55, Uzdavinys2.apvalinti(15.545678, 2), 0.001);
        assertEquals(15.546, Uzdavinys2.apvalinti(15.545678, 3), 0.0001);
    }

    @Test
    void testZero() {
        assertEquals(16.0, Uzdavinys2.apvalinti(15.545678, 0), 0.1);
        assertEquals(15.0, Uzdavinys2.apvalinti(15.1, 0), 0.1);
        assertEquals(16.0, Uzdavinys2.apvalinti(15.5, 0), 0.1);
        assertEquals(16.0, Uzdavinys2.apvalinti(15.9, 0), 0.1);
    }

    @Test
    void testNegative() {
        assertEquals(20.0, Uzdavinys2.apvalinti(15.545678, -1), 1);
        assertEquals(0.0, Uzdavinys2.apvalinti(15.545678, -2), 0.1);

    }
}
