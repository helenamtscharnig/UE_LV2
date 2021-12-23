public class WinterreifenpflichtDemo {

    public static void main(String[] args) {

        System.out.println(isWinterreifenPflicht(11, false));
        System.out.println(isWinterreifenPflicht(5, true));
        System.out.println(isWinterreifenPflicht(3, false));


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

}
