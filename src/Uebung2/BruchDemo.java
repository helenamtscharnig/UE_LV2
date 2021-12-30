package Uebung2;

public class BruchDemo {
    public static void main(String[] args) {

        Bruch br1 = new Bruch(2,3);
        Bruch br2 = new Bruch(10,5);
        Bruch br3 = new Bruch(7,8);

        System.out.println(br1.toDecimal());
        br1.print();
        System.out.println(br2.multiplicate(br2));



    }
}
