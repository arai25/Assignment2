import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("John", "Lennon", "Manager", 27045.78));
        peopleList.add(new Employee("George", "Harrison", "Developer", 50000.00));
        peopleList.add(new Student("Ringo", "Starr", 2.34));
        peopleList.add(new Student("Paul", "McCartney", 3.9));

        // Sorting based on the amount of money they make
        Collections.sort(peopleList);

        // Printing the sorted data
        printData(peopleList);
    }
}
