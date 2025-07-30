package gabayan1;

import java.util.Scanner;

public class GABAYAN1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks in Science: ");
        int sci = sc.nextInt();
        System.out.print("Enter marks in History: ");
        int his = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        int soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        int arts = sc.nextInt();

        int total = sci + his + math + soc + arts;
        double percent = total / 5.0;

        String remarks;
        if (percent < 70) {
            remarks = "Fail";
        } else if (percent <= 75) {
            remarks = "Poor";
        } else if (percent <= 80) {
            remarks = "Fair";
        } else if (percent <= 85) {
            remarks = "Good";
        } else if (percent <= 90) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }

        System.out.println("Total Marks: " + total);
        System.out.printf("Total percentage: %.2f%n", percent);
        System.out.println("Remarks: " + remarks);

        if (percent < 70) {
            System.out.println("Try Again! " + name + "\n You Failed.");
        } else {
            System.out.println("Congrats! " + name + "\nYou Passed.");
        }
    }
}


    

