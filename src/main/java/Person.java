import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int points;
    private Scanner scanner = new Scanner(System.in);

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        points = 0;
    }

    public int addPoints(int i) {
        int addedPoints = scanner.nextInt();
        return addedPoints + points;
    }

    public String toString() {
        return "First name: " + firstName +
                "\nLast name: " + lastName +
                "\nPoints: " + points;
    }

    public String getFirstName() {
        return firstName;
    }

   public void setFirstName(String firstName) {
        this.firstName = firstName;
   }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
