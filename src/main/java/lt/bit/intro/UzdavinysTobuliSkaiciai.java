package lt.bit.intro;

public class UzdavinysTobuliSkaiciai {

    public static void main(String[] args) {
        tobuliSkaiciai(100);
    }

    // Duotas sveikas teigiamas skaicius
    // Rasti visus tobulus skaicius ne didesnius uz duota skaiciu
    // ir juos atspausdinti
    public static void tobuliSkaiciai(int n) {
        for (int i = 1; i <= n; i++) {
            if (arSkaiciusTobulas(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean arSkaiciusTobulas(int x) {
        return dalikliuSuma(x) == x;
    }

    public static int dalikliuSuma(int x) {
        int suma = 1;
        for (int i = 2; i < x; i++) {
           if (x % i == 0) suma += i;
        }
        return suma;
    }
}
