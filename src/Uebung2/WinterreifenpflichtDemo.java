package Uebung2;

public class WinterreifenpflichtDemo {
    public static void main(String[] args) {

        System.out.println(isWinterreifenPflicht(4, true));
        System.out.println(isWinterreifenPflicht(11, true));
        System.out.println(isWinterreifenPflicht(3, false));

        printWinterreifen(isWinterreifenPflicht(4, true));

    }

    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if(temperatur < 4 || temperatur < 10 & rutschigeFahrbahn == true){
            System.out.println("Bitte Winterreifen verwenden");
            return true;
        }
        else{
            System.out.println("Winterreifen sind nicht erforderlich");
            return false;}
    }

    public static void printWinterreifen (boolean isWinterreifenpflicht){
        if(isWinterreifenpflicht){
            System.out.println("Bitte Winterreifen verwenden");
        }
        else{
            System.out.println("Winterreifen sind nicht erforderlich");}
    }




}
