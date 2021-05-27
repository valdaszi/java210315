package lt.bit.p0527.Uzdavinys;

public class UzdavinysTurnyras {

    public static void main(String[] args) {

        Mokinys[] mokiniai = sukurtiMokinius();

        int ratoNr = 1;
        Pora[] poros = pirmasRatas(mokiniai);
        spausdinti(ratoNr, poros);

        //TODO

    }

    private static void spausdinti(int ratoNr, Pora[] poros) {
        System.out.println(ratoNr + " ratas:");
        for (Pora pora : poros) {
            System.out.println(pora.game());
        }
    }


    public static Mokinys[] sukurtiMokinius() {
        return new Mokinys[] {
                new Mokinys("V1", "P1"),
                new Mokinys("V2", "P2"),
                new Mokinys("V3", "P3"),
                new Mokinys("V4", "P4")
        };
    }

    public static Pora[] pirmasRatas(Mokinys[] mokiniai) {
        //TODO
        return null;
    }

    public static Pora[] ratas(Pora[] poros) {
        //TODO
        return null;
    }

}
