public class loopMetoder {

    public int calculateTotalPoints(Person[] personer) {
        int total = 0;
        for (Person person : personer) {
            total += person.getPoint();
        }
        return total;
    }

    public Person findMinimum(Person[] personer) {
        Person personWithMinimum = personer[0];
        for (Person person : personer) {
            if (person.getPoint() < personWithMinimum.getPoint())
                personWithMinimum = person;
        }
        return personWithMinimum;
    }

    public Person findMaximum(Person[] personer) {
        Person PersonWithMax = personer[0];
        for (Person person : personer) {
            if (person.getPoint() > PersonWithMax.getPoint())
                PersonWithMax = person;
        }
        return PersonWithMax;

    }


    int[] array = {8, 3, 4, 11, 2, 7, 9, 5, 7};

    public int findStørsteTal() {
        int størsteTal = array[0];
        for (int tal : array) {
            if (tal > størsteTal)
                størsteTal = tal;
        }
        return størsteTal;
    }


}


