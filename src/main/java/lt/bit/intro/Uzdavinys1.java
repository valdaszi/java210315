package lt.bit.intro;

import java.util.Arrays;
import java.util.Scanner;

/*
Duoti trys skaičiai: a, b, c. Nustatykite ar šie skaičiai gali būti
trikampio kraštinių ilgiai ir jei gali tai kokio trikampio:
lygiakraščio, lygiašonio ar įvairiakraščio.
Atspausdinkite atsakymą.
 */
public class Uzdavinys1 {

    public static void main(String[] args) {
        System.out.println("Uzdavinys 1:");

        // 1. Gauti pradinius duomenis
        int[] prad;
        if (args.length == 3) {
            prad = pradiniaiDuomenysIsArgs(args);
        } else {
            prad = pradiniaiDuomenysInteraktyviai();
        }

        int a = prad[0], b = prad[1], c = prad[2];
        System.out.println("Pradiniai duomenys: a, b, c = " + a + ", " + b + ", " + c);

        // 2. Uzdavinio skaiciavimai (sprendimas)
        String trikampioTipas = sprendimas(a, b, c);

        // 3. Rezultato isvedimas (spausdinimas)
        // a1 = a; a2 = b; a3 = c; result = trikampioTipas
        // rezultatoIsvedimas() ...
        rezultatoIsvedimas(a, b, c, trikampioTipas);
    }

    static void rezultatoIsvedimas(int a1, int a2, int a3, String result) {
        System.out.println("Sprendimas:");
        System.out.println(a1 + ", " + a2 + ", " + a3 + " yra " + result);
    }

    static String sprendimas(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            // kazkoks trikampis
            if (a == b && c == a) {
                return "lygiakrastis";
            } else if (a == b || b == c || a == c) {
                return "lygiasonis";
            } else {
                return "ivairiakrastis";
            }
        } else {
            return "ne trikampis";
        }
    }

    static int[] pradiniaiDuomenysIsArgs(String[] args) {
        System.out.println("args = " + Arrays.toString(args));

        int[] m = new int[3];
        // tarkime is kazkur tos reiksmes ateina
        m[0] = Integer.parseInt(args[0]);
        m[1] = Integer.parseInt(args[1]);
        m[2] = Integer.parseInt(args[2]);

        return m;
    }

    static int[] pradiniaiDuomenysInteraktyviai() {
        System.out.print("Iveskite triju trikampio krastiniu ilgius: ");

        Scanner scanner = new Scanner(System.in);
        int[] m = new int[3];

        m[0] = scanner.nextInt();
        m[1] = scanner.nextInt();
        m[2] = scanner.nextInt();

        return m;
    }

}
