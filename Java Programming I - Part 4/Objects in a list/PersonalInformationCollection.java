import java.util.Scanner;
import java.util.ArrayList;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();

        // After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.
        while (true) {
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = scan.nextLine();

            System.out.print("Identification number: ");
            String idNumber = scan.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        // Then print the collected personal information so that each entered object is printed in the following format:
        // first and last names separated by a space (you don't print the identification number).
        System.out.println("");
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
