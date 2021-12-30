package Uebung2;

public class Konto {
    private String kontoinhaber;
    private int kontostand;

    public Konto(String kontoinhaber, int kontostand) {
        this.kontoinhaber = kontoinhaber;
        this.kontostand = 0;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public int getKontostand() {
        return kontostand;
    }

    public int aufbuchen(int betrag){
        int erg = kontostand + betrag;
        kontostand = erg;
        return kontostand;

    }

    public int abbuchen(int betrag) {
        int erg;
        if (kontostand - betrag >= 0) {
            erg = kontostand - betrag;
            kontostand = erg;
            return kontostand;
        } else {
            return 0;
        }
    }


}
