public class PersonDemo {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.firstname = "Helena";
        person1.lastname = "Tscharnig";
        person1.age = 24;
        person1.gender = 'f';

        person2.firstname = "Johannes";
        person2.lastname = "Tscharnig";
        person2.age = 21;
        person2.gender = 'm';

        System.out.println(person1.firstname+" "+person1.lastname+" "+person1.age+" Jahre "+person1.gender);
        System.out.println(person2.firstname+" "+person2.lastname+" "+person2.age+" Jahre "+person2.gender);
    }
}
