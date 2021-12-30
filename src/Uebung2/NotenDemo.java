package Uebung2;

public class NotenDemo {
    public static void main(String[] args) {
        System.out.println("Die Note ist: "+getNotentext(95));
        System.out.println("Die Note ist: "+getNotentext(63));
        System.out.println("Die Note ist: "+getNotentext(74));
        System.out.println("Die Note ist: "+getNotentext(50));


    }

    public static String getNotentext(int punkte){

        if(punkte >= 90){
            return "Sehr gut";
        }
        else if (punkte >= 78){
            return "Gut";
        }
        else if (punkte >= 65){
            return "Befriedigend";
        }
        else if (punkte >= 51){
            return "Genügend";
        }
        else{return "Nicht genügend";}

    }


}
