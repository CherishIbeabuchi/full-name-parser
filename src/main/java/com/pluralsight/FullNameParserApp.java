package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {

        //Create a scanner
        Scanner theScan = new Scanner(System.in);

        //ask the user for their full name
        System.out.println("Please enter your full name: ");
        String fullName = theScan.nextLine().trim();


        //Split the full name
        String[] nameParts = fullName.split(" ");

        //My if statements
        if(nameParts.length == 3) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle Name: " + nameParts[1]);
            System.out.println("Last Name: " + nameParts[2]);
        } else {
            if (nameParts.length == 2) {
                System.out.println("First name: " + nameParts[0]);
                System.out.println("Middle Name: (none)");
                System.out.println("Last Name: " + nameParts[1]);
            }else {
                System.out.println("Invalid name format.");
            }


        }
        theScan.close();









    }
}
