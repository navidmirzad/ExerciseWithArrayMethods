import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person harry = new Person("Harry", "Potter");
        Person ron = new Person("Ron", "Weasley");
        Person hermione = new Person("Hermione", "Granger");
        Person draco = new Person("Draco", "Malfoy");
        Person neville = new Person("Neville", "Longbottom");
        Person ginny = new Person("Ginny", "Weasley");

        Person personer[] = {harry, ginny, ron, hermione, draco};

        for (Person person : personer) {
            System.out.println(person);
        }

        harry.setPoints(100);
        ron.setPoints(231);
        hermione.setPoints(420);
        draco.setPoints(215);
        neville.setPoints(420);
        ginny.setPoints(1000);

        System.out.println(Arrays.toString(personer));

       // System.out.println(harry + "\n" + ron + "\n" + hermione);



    }

}
