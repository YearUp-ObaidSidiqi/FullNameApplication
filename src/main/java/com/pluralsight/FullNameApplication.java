package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String firstName, middleName, lastName, suffix, fullName;
        System.out.println("PLease Enter Your Information");
        firstName = getNamePromt("\nPLease Enter Your First Name: ");
        middleName = getNamePromt("PLease Enter Your Middle Name: ");
        lastName= getNamePromt("PLease Enter Your Last Name: ");
        suffix= getNamePromt("PLease Enter Your Suffix: ");

        if (middleName == "") {
            if (suffix == "") {
                System.out.println("Your Full Name is: " + firstName + " " + lastName);
            }
        }
            if (suffix == "") {
                System.out.println("Your Full Name is: " + firstName + " "+middleName+" " + lastName);
            }

    }

    public static String getNamePromt(String promt){
        System.out.println(promt);
        String output = scanner.nextLine();
        return output;

    }
    // Manually Typing in!

            /*System.out.print("\nPLease Enter Your First Name: ");
        firstName = scanner.nextLine();
        System.out.print("PLease Enter Your Middle Name: ");
        middleName = scanner.nextLine();
        System.out.print("PLease Enter Your Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("PLease Enter Your Suffix: ");
        suffix = scanner.nextLine();
*/


}
