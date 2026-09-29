import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {

        // Display the party affiliation menu
        // Input the user's party choice
        // If D, output Democratic Donkey
        // Else if R, output Republican Elephant
        // Else if I, output Independent Person
        // Otherwise output Other

        Scanner in = new Scanner(System.in);

        String party = "";

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");

        party = in.nextLine();

        if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}