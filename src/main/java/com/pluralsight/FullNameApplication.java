package com.pluralsight;
import java.util.Scanner;
public class FullNameApplication {
    public static void main(String[] args) {

        String firstName, middleName, lastName, suffix;

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease Enter Your Information");
        System.out.print("\nPLease Enter Your First Name: ");
        firstName = scanner.nextLine();
        System.out.print("PLease Enter Your Middle Name: ");
        middleName = scanner.nextLine();
        System.out.print("PLease Enter Your Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("PLease Enter Your Suffix: ");
        suffix = scanner.nextLine();





        System.out.println("Your Full Name is: " + firstName+", "+middleName+", "+lastName+" "+suffix +".");
    }
}
