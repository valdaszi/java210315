package lt.bit.p0524;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Zmogus z1 = new Zmogus("Ona", "ona@mail.lt");
        Zmogus z2 = new Zmogus("Ona", "ona@mail.lt");

        System.out.println("z1 = " + z1.toString());
        System.out.println("z2 = " + z2);

        System.out.println("z1 == z2 ? " + (z1 == z2));
        System.out.println("z1.equals(z2) ? " + z1.equals(z2));

        String s = "ab";
        String s1 = s.concat("c"); // s + "c"
        String s2 = "a" + "b" + "c";
        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1.equals(s2) ? " + s1.equals(s2));

        LocalDate date1 = LocalDate.of(2020, 12, 31);
        LocalDate date2 = LocalDate.of(2020, 12, 31);
        System.out.println("date1 == date2 ? " + (date1 == date2));
        System.out.println("date1.equals(s2) ? " + date1.equals(date2));

        Zmogus z3 = new Zmogus(null, "marija@one.lt");

        Zmogus[] zmones = new Zmogus[] { z1, z2, z1, z1, z3 };
        System.out.println("viso zmoniu: " + zmones.length);

        System.out.println("z1.equals(z3) ? " + z1.equals(z3));
        System.out.println("z3.equals(z1) ? " + z3.equals(z1));
    }
}
