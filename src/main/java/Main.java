public class Main {
    public static void main(String[] args) {

    Person person1 = new Person("Harry", "Potter");
    Person person2 = new Person("Ron", "Weasley");
    Person person3 = new Person("Hermione", "Granger");

        person1.addPoints(100);
        person2.addPoints(231);
        person3.addPoints(420);

        System.out.println(person1 + "\n" + person2 + "\n" + person3);



    }

}
