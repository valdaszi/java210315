/*
    Parašykite programą, kuri mokėtų suapvalinti double tipo skaičius pagal
    nurodytą tikslumą. Panaudokite matematinę funkciją Math.floor(…)

        Math.floor(2.345) = 2.0
        Math.floor(2.999) = 2.0

        programa 15.545678 -1 -> 20.0
        programa 15.545678  0 -> 16.0
        programa 15.545678  1 -> 15.5
        programa 15.545678  2 -> 15.55
        programa 15.545678  3 -> 15.546
 */

public class Uzdavinys2 {

//    public static void main(String[] args) {
//        System.out.println("15.545678 -1 => " + apvalinti(15.545678, -1));
//        System.out.println("15.545678  0 => " + apvalinti(15.545678, 0));
//        System.out.println("15.545678  1 => " + apvalinti(15.545678, 1));
//        System.out.println("15.545678  2 => " + apvalinti(15.545678, 2));
//        System.out.println("15.545678  3 => " + apvalinti(15.545678, 3));
//
//        System.out.println("15.1  0 => " + apvalinti(15.1, 0));
//        System.out.println("15.5  0 => " + apvalinti(15.5, 0));
//        System.out.println("15.9  0 => " + apvalinti(15.9, 0));
//
//    }


    // a = 15.545678 ~ x.xx
    // 1. a * 100 - 1554.5678
    // 2. a -> 0 ~  1555
    // 3. a / 100 = 15.55

    // 10 ^ -1 = 0.1 = 1/ 10
    // 10 ^ -2 = 0.01 = 1 / 100

    // a = 15.545678 ~ x0.0
    // 1. a * 0.1 = 1.55...
    // 2. a -> ~ 2.0
    // 3. a / 0.1 = 20.0
    static double apvalinti(double d, int tikslumas) {
        if (tikslumas == 0) return Math.floor(d + 0.5);
        double x = Math.pow(10.0, tikslumas);
        return Math.floor(d * x + 0.5) / x;
    }
}
