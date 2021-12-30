package Uebung2;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public double toDecimal(){
        double erg;
        erg = zaehler / nenner;
        return erg;
    }

    public void print(){
        System.out.println(zaehler+" / "+nenner);
    }

    public Bruch multiplicate(Bruch b2){
        Bruch bnew = new Bruch(b2.getZaehler()*b2.getZaehler(), b2.getNenner()*b2.getNenner());
        return bnew;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3){
        int bb1 = b2.zaehler*b3.zaehler;
        int bb2 = b2.nenner*b3.nenner;
        Bruch bnew = new Bruch(bb1, bb2);
        return bnew;
    }



}
