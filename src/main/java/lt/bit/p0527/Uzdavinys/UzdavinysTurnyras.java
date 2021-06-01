package lt.bit.p0527.Uzdavinys;

public class UzdavinysTurnyras {

    public static void main(String[] args) {

        System.out.println(Vardas.version());

        Vardas[] games = sukurtiMokinius();
        spausdinti(0, games);

        int ratoNr = 1;

        while (games.length >= 2) {
            games = ratas(games);
            spausdinti(ratoNr, games);
            ratoNr++;
        }
    }

    private static void spausdinti(int ratoNr, Vardas[] poros) {
        System.out.println(ratoNr == 0 ? "Zaidejai: " : (ratoNr + " ratas:"));
        for (Vardas pora : poros) {
            System.out.println(pora.game());
        }
    }


    public static Mokinys[] sukurtiMokinius() {
        return new Mokinys[] {
                new Mokinys("V1", "P1"),
                new Mokinys("V2", "P2"),
                new Mokinys("V3", "P3"),
                new Mokinys("V4", "P4"),
                new Mokinys("V5", "P5"),
                new Mokinys("V6", "P6"),
                new Mokinys("V7", "P7"),
                new Mokinys("V8", "P8")
        };
    }

//    public static Pora[] pirmasRatas(Mokinys[] mokiniai) {
//        Pora[] games = new Pora[mokiniai.length / 2];
//        for (int i = 0; i < mokiniai.length; i += 2) {
//            games[i / 2] = new Pora(mokiniai[i], mokiniai[i+1]);
//        }
//        return games;
//    }


    /*
       2, 4, 8, 16, 32 ....

       1  2  3  4  5  6  7  8
       9 10 11 12
       ----------------------
       A  B  C  D  5  6  7  8
     */
    public static Pora[] ratas(Vardas[] zaidejai) {
        Pora[] games = new Pora[zaidejai.length / 2];
        for (int i = 0; i < zaidejai.length; i += 2) {
            games[i / 2] = new Pora(zaidejai[i], zaidejai[i+1]);
        }
        return games;
    }

}
