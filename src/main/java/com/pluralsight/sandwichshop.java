///*
//package com.pluralsight;
// */
//
//import java.util.Scanner;
//
//public class SandwichShop {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt for sandwich size
//        System.out.println("Choose the size of the sandwich:");
//        System.out.println("1: Regular ($5.45)");
//        System.out.println("2: Large ($8.95)");
//        int sizeChoice = scanner.nextInt();
//
//        double basePrice = 0.0;
//
//        // Determine base price based on choice
//        float price = 0.00f;
//
//        if(sizeChoice == 1) {
//            price  = 5.45f;
//        }   else if (sizeChoice == 2) {
//            price = 8.95f;
//        }   else {
//            System.out.println("Wrong Option Selected");
//        }
//
//
//        // Prompt for age
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        // Calculate discount based on age
//        double discount = 0.0;
//
//        if (age <= 17) {
//            discount = 0.10; // 10% discount for students
//        } else if (age >= 65) {
//            discount = 0.20; // 20% discount for seniors
//        }
//
//        // Calculate final price
//        double finalPrice = basePrice * (1 - discount);
//
//        // Display the final cost
//        System.out.printf("The final cost of your sandwich is: $%.2f%n", finalPrice);
//
//        // Close the scanner
//        scanner.close();
//    }
//}
//
////        Step 1
// //       Prompt the user for the size of the sandwich (1 or 2):
// //       - 1: Regular: base price $5.45
//  //      - 2: Large: base price $8.95
////        Prompt the user for their age:
////        - Student (17 years old or younger) — receive a 10% discount
////        - Seniors (65 years old or older) — receive a 20% discount
////        Display the cost of the sandwich to the screen }
//
///*
//
//

math.
