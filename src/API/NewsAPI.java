package API;

import java.util.Scanner;

public class NewsAPI {

    public NewsAPI() {

    }

    public String getState() {

        // Ask user for two digit state
        Scanner scanner = new Scanner(System.in);

        // Tell User to enter two digit state
        System.out.println("Enter state name: ");

        // Get the two digit state
        String state = scanner.next();

        System.out.print("You entered: " + state);

        return state;
    }

    public String getCountry() {

        // Ask user for two digit state
        Scanner scanner = new Scanner(System.in);

        // Tell User to enter two digit state
        System.out.println("Enter two digit country: ");

        // Get the two digit state
        String country = scanner.next();

        System.out.print("You entered: " + country);

        return country;

    }
}
