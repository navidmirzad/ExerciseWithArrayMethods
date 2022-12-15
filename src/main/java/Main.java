import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        loopMetoder loopMetoder = new loopMetoder();

        Person harry = new Person("Harry", "Potter");
        Person ron = new Person("Ron", "Weasley");
        Person hermione = new Person("Hermione", "Granger");
        Person draco = new Person("Draco", "Malfoy");
        Person neville = new Person("Neville", "Longbottom");
        Person ginny = new Person("Ginny", "Weasley");

        Person personer[] = {harry, ginny, ron, hermione, draco, neville};

       /* for (Person person : personer) {
            System.out.println(person);
        } */

        harry.addPoints(100);
        ron.addPoints(231);
        hermione.addPoints(420);
        draco.addPoints(215);
        neville.addPoints(420);
        ginny.addPoints(1000);

        personer[0] = harry;
        personer[1] = ginny;
        personer[2] = ron;
        personer[3] = hermione;
        personer[4] = neville;
        personer[5] = draco;

        System.out.println(Arrays.toString(personer));

       // System.out.println(harry + "\n" + ron + "\n" + hermione);


        System.out.println("Total amount of points: " + loopMetoder.calculateTotalPoints(personer));
        System.out.println("____________________");
        System.out.println("least amount of points : " + loopMetoder.findMinimum(personer));
        System.out.println("____________________");
        System.out.println("Most amount of points: " + loopMetoder.findMaximum(personer));



    }

}
