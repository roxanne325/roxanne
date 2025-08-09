
package roxanneapp;

import java.util.Scanner;

public class RoxanneSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RoxanneBanking banking = new RoxanneBanking();

        boolean running = true;
        while (running) {
      
            System.out.println("\n======== WELCOME TO ROXANNE'S SERVICE SYSTEM ========");
            System.out.println("Please choose a service:");
            System.out.println("1. Banking");
            System.out.println("2. Doctor's Appointment");
            System.out.println("3. Shopping");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    boolean bankingActive = true;
                    while (bankingActive) {
                        System.out.println("\n--- Banking Menu ---");
                        System.out.println("1. Register Account");
                        System.out.println("2. Login Account");
                        System.out.println("3. View All Accounts");
                        System.out.println("0. Back to Main Menu");

                        System.out.print("Enter selection: ");
                        int bankChoice = input.nextInt();

                        switch (bankChoice) {
                            case 1:
                                banking.registerAccount(input);
                                break;
                            case 2:
                                banking.loginAccount(input);
                                break;
                            case 3:
                                banking.viewAllAccounts();
                                break;
                            case 0:
                                bankingActive = false;
                                break;
                            default:
                                System.out.println("Invalid selection.");
                        }

                        if (bankingActive) {
                            System.out.print("Do you want to continue in Banking? (1 = Yes / 0 = No): ");
                            int cont = input.nextInt();
                            if (cont == 0) {
                                bankingActive = false;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n[Doctor's Appointment] This service is under development.");
                    break;
                case 3:
                    System.out.println("\n[Shopping] This service is under development.");
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you for using Roxanne's Service System!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (running) {
                System.out.print("Do you want to continue in Main Menu? (1 = Yes / 0 = No): ");
                int cont = input.nextInt();
                if (cont == 0) {
                    running = false;
                    System.out.println("Thank you for using Roxanne's Service System!");
                }
            }
        }

        input.close();
    }
}
