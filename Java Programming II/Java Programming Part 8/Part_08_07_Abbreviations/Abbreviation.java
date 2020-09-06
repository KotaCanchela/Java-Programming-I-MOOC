import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Abbreviations hash = new Abbreviations();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an abbreviation ('stop' to quit)");
            String abbreviation = scan.nextLine();
            if (abbreviation.equals("stop")) {
                break;
            }
            System.out.println("Enter an explanation for the abbreviation");
            String explanation = scan.nextLine();

            hash.addAbbreviation(abbreviation, explanation);

        }

        while (true) {
            System.out.println("Search for an abbreviation ('stop' to quit)");
            String search = scan.nextLine();
            if (search.equals("stop")) {
                break;
            }
            System.out.println("");
           System.out.println(hash.findExplanationFor(search));
        }


    }
}
