public class KontoDemo {

    public static void main(String[] args) {
        Konto k1 = new Konto();
        Konto k2 = new Konto();
        Konto k3 = new Konto();

        k1.setInhaber("Helena Tscharnig");
        k2.setInhaber("Johannes Tscharnig");
        k3.setInhaber("Monika Tscharnig");

        System.out.println("Der aktuelle Kontostand ist: "+k1.aufbuchen(500));
        System.out.println("Der aktuelle Kontostand ist: "+k1.aufbuchen(200));
        System.out.println("Der aktuelle Kontostand ist: "+k2.aufbuchen(100));
        System.out.println("Der aktuelle Kontostand ist: "+k3.aufbuchen(5000));

        System.out.println("Der aktuelle Kontostand ist: "+k1.abbuchen(300));
        System.out.println("Der aktuelle Kontostand ist: "+k2.abbuchen(200));
        System.out.println("Der aktuelle Kontostand ist: "+k3.abbuchen(500));

    }






}
