import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Harry", "Potter");
        Person person2 = new Person("Ron", "Weasley");
        Person person3 = new Person("Hermione", "Granger");

        Person personer[] = {person1, person2, person3};

        for (Person person : personer) {
            System.out.println(person);
        }

        // System.out.println(Arrays.toString(personer));

        //System.out.println(person1 + "\n" + person2 + "\n" + person3);


    }

}
