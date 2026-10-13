package com.hassiebinc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Here is where you write code.
        System.out.println("Welcome to the Remind You app\n");
        // \n = System.out.println("");
        System.out.println("Don't forget to track your distance with the fitness app\n");
        System.out.println("Don't forget to get gas");
        System.out.println("You need to call my Mom");
        // Variables cheatsheet

        // Data types
        String appname = "RemindYou"; // Text
        int number = 30; // Whole Number
        double weight = 80.5; // Decimal Number
        boolean happy = true; // True or False
        float salary = 2394.9592f; // Comma number with one more decimal(f)
        char firstletter = 'R'; // 1 letter command

        // Store information
        // Your name
        // You age
        // Your weight
        // Dream Salary per month
        // firstLetterOfYourLastname
        // LovesGaming (boolean)
        String myname = "Thuan Luu";
        int age = 28;
        double myweight = 67.5;
        float dreamsalary = 9999.99f; // Always have to use 'f' for float
        char firstletterofmyname = 'T';
        boolean lovestosleep = true;
        boolean gamer = true;
        System.out.println("=== About Me ===");
        System.out.println("Name: " + myname);
        System.out.println("Weight: " + myweight);
        System.out.println("Age: " + age);
        System.out.println("Dream Salary per month: $" + dreamsalary);
        System.out.println("Likes to game? " + gamer);

        // Create your own data type
        // System.out.println("Likes to sleep? " + lovestosleep);

        // ==========================================
        // BONUS CHALLENGE
        // ==========================================

        // Print your information using
        // System.out.println("Name: " + name);

        // Example output:
        // camelCasing --- vs PascalCasing
        // === ABOUT ME ===
        // Name: Alex
        // Age: 22
        // Weight: 75.5 kg
        // Dream Salary: 5000 per month
        // First Letter: J
        // Loves Gaming: true
        // PascalCasing = Classnames (FirstLetter Uppercase)
        //camelCasing = Variables


    }
}