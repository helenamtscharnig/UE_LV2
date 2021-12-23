public class NotenDemo {
    public static void main(String[] args) {

        System.out.println("Die Note ist: "+getNotentext(60));
        System.out.println("Die Note ist: "+getNotentext(97));
        System.out.println("Die Note ist: "+getNotentext(43));

    }

    public static String getNotentext(int punkte){
        if(punkte >= 90){
            return "Sehr Gut";
        }
        else if (punkte <= 89 && punkte >= 78){
            return "Gut";
        }
        else if (punkte <= 77 && punkte >= 65){
            return "Befriedigend";
        }
        else if (punkte <= 64 && punkte >= 51){
            return "Genügend";
        }
        else {return "Ungenügend";}

    }
}
