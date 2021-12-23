public class Konto {
    private String kontoinhaber;
    private int kontostand;

    public void setInhaber(String inhaber) {
        kontoinhaber = inhaber;
        kontostand = 0;
    }

    public int aufbuchen(int betrag){
        this.kontostand = kontostand;
        kontostand = kontostand + betrag;
        return kontostand;

    }

    public int abbuchen(int betrag){
        this.kontostand = kontostand;
        kontostand = kontostand - betrag;
        if (kontostand <0){
            return 0;
        }
        else {return kontostand;}
    }

}

