package Uebung2;

public class KontoDemo {
    public static void main(String[] args) {

        Konto k1 = new Konto("Helena Tscharnig", 1000);
        Konto k2 = new Konto("Markus Müller", 3000);

        System.out.println(k1.aufbuchen(100));
        System.out.println(k1.aufbuchen(700));
        System.out.println(k2.aufbuchen(500));

        System.out.println(k1.abbuchen(400));
        System.out.println(k1.abbuchen(600));
    }
}
