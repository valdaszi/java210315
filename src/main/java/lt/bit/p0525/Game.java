package lt.bit.p0525;

import java.time.LocalDate;

public class Game {

    public static void main(String[] args) {

        Stone stone = new Stone("Puntukas");
        Lake lake = new Lake("Tauragnu ez.");
        Man peasant = new Man("Peasant", 1);
        Man king = new Man("Adam IV", 99);
        Man queen = new Man("Victoria", 99);

        printAllTitles();
        printAllTitles(stone, lake);
        printAllTitles(peasant, king, queen);


        Object[] o = new Object[] {
                stone, queen, "Kuku", null, LocalDate.now(), 'A', 123, 3.14, false
        };
        System.out.println("*** Viso daiktu: " + countThings(o));

        if (o[1] instanceof String) {
            String s1 = (String) o[1];
            System.out.println(s1);
        }

    }

    static void printAllTitles(Thing... things) {
        for (Thing thing : things) {
            System.out.println(thing.getTitle());
        }
    }

    static int countThings(Object... objects) {
        System.out.println("*** Counting things: ");
        int counter = 0;
        for (Object obj : objects) {
            System.out.println(obj);
            if (obj instanceof Thing) {
                counter++;
            }
        }
        return counter;
    }
}
