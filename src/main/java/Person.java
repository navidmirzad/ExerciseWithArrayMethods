public class Person {

    private String firstName;
    private String lastName;
    private int points;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        points = 0;
    }

    public String toString() {
        return "First name: " + firstName +
                "\nLast name: " + lastName +
                "\nPoints: " + points;
    }



}
