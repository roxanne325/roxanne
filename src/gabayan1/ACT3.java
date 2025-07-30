
package gabayan1;

import java.util.Scanner;

public class ACT3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Inputted number Zero");
        } else if (num > 0) {
            System.out.println(num + " is a positive number");
        } else {
            System.out.println(num + " is a negative number");
        }
    }
}