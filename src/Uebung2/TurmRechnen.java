package Uebung2;

public class TurmRechnen {
    public static void main(String[] args) {
        int number = 2;
        int count = 1;
        int result;

        while(count <= 9){
            result = number*count;
            System.out.println(number+" * "+count+" = "+result);
            number = result;
            count++;
        }

        count = 1;
        while(count <= 9){
            result = number / count;
            System.out.println(number+" / "+count+" = "+result);
            number = result;
            count++;
        }
    }





}
