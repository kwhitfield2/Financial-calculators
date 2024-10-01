package com.pluralsight;

import java.util.Scanner;

public class  {
    private static final int Months_In_A_Year = 12;
}
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//      Name of Calculator
        System.out.println("My Finance Calculator");

//      Loan Amount
        System.out.print(" Enter the Principal");
        double principal = keyboard.nextDouble();

        System.out.print("Enter the Annual Interest Rate");
        double annualInterest = keyboard.nextDouble();

        System.out.print("Enter the Loan Length in Years");
        int loanLength = keyboard.nextInt();


        double MonthlyInterestRate = annualInterest / mortgagecalc.Months_In_A_Year;
        int numberOfPayments = loanLength * mortgagecalc.Months_In_A_Year;

        double monthlyPayment = (principal *
        MonthlyInterestRate * math.pow (1 + MonthlyInterestRate, numberOfPayments)/ math.pow(1+ MonthlyInterestRate)-1);

        System.out.printf("Total Monthly Payment: $%.2f \n");
        System.out.println("Total Interest Paid: $%.2f \n");

        int math.max()








        













   }