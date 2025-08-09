
package roxanneapp;

import java.util.Scanner;

class Account {
    private int accountNumber;
    private int pin;

    public Account(int accountNumber, int pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }
}

class RoxanneBanking {
    private Account[] accounts = new Account[100];
    private int accountCount = 0;

    public void registerAccount(Scanner input) {
        System.out.print("Enter Account No: ");
        int accNo = input.nextInt();

        System.out.print("Enter Account Pin: ");
        int pin = input.nextInt();

        if (findAccount(accNo) != null) {
            System.out.println("Account number already exists!");
            return;
        }
        if (accountCount >= accounts.length) {
            System.out.println("Account storage full!");
            return;
        }
        accounts[accountCount] = new Account(accNo, pin);
        accountCount++;
        System.out.println("Registered successfully. Please login.");
    }

    public void loginAccount(Scanner input) {
        System.out.print("Enter Account No: ");
        int accNo = input.nextInt();

        System.out.print("Enter Account Pin: ");
        int pin = input.nextInt();

        Account acc = findAccount(accNo);
        if (acc != null && acc.getPin() == pin) {
            System.out.println("LOG-IN SUCCESS");
        } else {
            System.out.println("Invalid account or PIN.");
        }
    }

    public void viewAllAccounts() {
        System.out.println("Accounts List:");
        if (accountCount == 0) {
            System.out.println("No accounts registered yet.");
            return;
        }
        for (int i = 0; i < accountCount; i++) {
            System.out.println("Account No: " + accounts[i].getAccountNumber());
        }
    }

    private Account findAccount(int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }
}