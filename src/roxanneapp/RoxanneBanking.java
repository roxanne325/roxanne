
package roxanneapp;

import java.util.Scanner;

public class RoxanneBanking {
    private final int accountNumber = 20005;
    private final int pinCode = 0325;

    public void login(Scanner input) {
        int attempts = 0;

        System.out.println("\n--- Roxanne's Banking Login ---");

        while (attempts < 3) {
            System.out.print("Enter Account Number: ");
            int enteredAcc = input.nextInt();

            System.out.print("Enter PIN: ");
            int enteredPin = input.nextInt();

            if (enteredAcc == accountNumber && enteredPin == pinCode) {
                System.out.println("\n[ACCESS GRANTED] Welcome, valued client of Roxanne.");
           
                return;
            } else {
                attempts++;
                System.out.println("Incorrect details. Attempt " + attempts + " of 3.");
            }
        }

        System.out.println("\nAccess blocked. Too many failed attempts.");
    }
}

    

