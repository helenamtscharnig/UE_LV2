public class WinterreifenpflichtDemo {

    public static void main(String[] args) {

        int temperatur = 12;
        boolean rutschigeFahrbahn = true;

        System.out.println(isWinterreifenPflicht(11, false));
        System.out.println(isWinterreifenPflicht(5, true));
        System.out.println(isWinterreifenPflicht(3, false));

        boolean winterreifenPflicht = isWinterreifenPflicht(temperatur, rutschigeFahrbahn);
        printWinterreifenwahl(winterreifenPflicht);

        printWinterreifenwahl(isWinterreifenPflicht(11, false));
        printWinterreifenwahl(isWinterreifenPflicht(5, true));
        printWinterreifenwahl(isWinterreifenPflicht(3, false));

    }

    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if(temperatur < 4){
            return true;
        }
        else if ((temperatur >= 4 && temperatur < 10 && rutschigeFahrbahn) == true){
            return true;
        }
        else {return false; }
    }

    public static void printWinterreifenwahl(boolean isWinterreifenpflicht){
        if (isWinterreifenpflicht){
            System.out.println("Bitte Winterreifen verwenden");
        }
        else{
            System.out.println("Winterreifen sind nicht erforderlich.");
        }
    }
}
