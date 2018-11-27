package API;

import java.util.Scanner;

public class PropublicaAPI implements IPropublicaAPI {
    public String getState() {

        // Ask user for two digit state
        Scanner scanner = new Scanner(System.in);

        // Tell User to enter two digit state
        System.out.println("Enter two digit state: ");

        // Get the two digit state
        String state = scanner.next();

        System.out.print("You entered: " + state);

        return state;
    }

    public String getLegID() {

        Scanner scanner = new Scanner(System.in);

        // Print Example to user
        System.out.println("Please enter enter a Rep Leg_id: EX (Y000064): ");

        // Store Leg_id entered by user
        String userRepID = scanner.next();

        // Return user legislator ID
        return userRepID;

    }

    public String getQuarter() {
        Scanner scanner = new Scanner(System.in);

        // Print Example to user
        System.out.println("Please enter enter a Quarter(1,2,3,4): ");

        // Store Leg_id entered by user
        String quarter = scanner.next();

        // Return user legislator ID
        return quarter;
    }

    public String getYear() {
        Scanner scanner = new Scanner(System.in);

        // Print Example to user
        System.out.println("Please enter a Year(2009-2017): ");

        // Store Leg_id entered by user
        String year = scanner.next();

        // Return user legislator ID
        return year;
    }
}
