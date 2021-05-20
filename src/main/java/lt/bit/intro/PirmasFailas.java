package lt.bit.intro;

import java.util.Arrays;

public class PirmasFailas {

    // bla bla bla

    public static void main(String[] args) {

        System.out.println("Yes");

        var x = "Labas rytas";
        System.out.println(x);

        char c = 'C';
        String s = "C";

        System.out.println("Karalius " + '\u265A' + " ir " + (char)9819);


        double d = 6 / 4;
        System.out.println("d = " + d);

        short d2 = 6 / 4;
        System.out.println("d2 = " + d2);

        int d3 = (int) (6.0 / 4.0);
        System.out.println("d3 = " + d3);

        // 1000000002

        System.out.println("11 == 11.0 ? " + (11 == 11.0));
        // System.out.println("11 == \"11\" ? " + (11 == "11"));

        String[] vardai = { "Ona", "Jonas" };
        vardai[1] = "Antanas";

        System.out.println("vardai: " + Arrays.toString(vardai));

        String[] adresai = new String[5];
        System.out.println("adresai: " + Arrays.toString(adresai));
        adresai[2] = "Vytauto g. 101, Jonava";
        System.out.println("adresai: " + Arrays.toString(adresai));


    }
}
