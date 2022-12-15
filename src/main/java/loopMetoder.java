public class loopMetoder {

    public int calculateTotalPoints(Person[]personer) {
        int total = 0;
        for (Person person : personer) {
            total += person.getPoints();
        }
        return total;
    }

}

