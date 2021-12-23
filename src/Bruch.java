public class Bruch {
    int zaehler;
    int nenner;

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
        double result = zaehler / nenner;
        return result;
    }

    public void print(){
        System.out.println(zaehler + " / "+ nenner);
    }

}
