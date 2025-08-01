
package roxanneapp;

import java.util.Scanner;

public class RoxanneSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======== WELCOME TO ROXANNE'S SERVICE SYSTEM ========");
        System.out.println("Please choose a service:");
        System.out.println("1. Banking");
        System.out.println("2. Doctor's Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                RoxanneBanking banking = new RoxanneBanking();
                banking.login(input);
                break;
            case 2:
                System.out.println("\n[Doctor's Appointment] This service is under development.");
                break;
            case 3:
                System.out.println("\n[Shopping] This service is under development.");
                break;
            default:
                System.out.println("\nInvalid choice. Please restart and choose 1, 2, or 3.");
        }

        input.close();
    }
}


