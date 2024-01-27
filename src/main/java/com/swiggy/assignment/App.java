package com.swiggy.assignment;

import java.util.Scanner;

/**
 * The main application class.
 * This class takes user input for two players (Player A and Player B) and initializes the MagicalArena to simulate a game.
 */

public class App {

    /**
     * The main method to start the application.
     *
     * @param args Command line arguments (not used in this application).
     * @throws Exception If an exception occurs during the execution of the game.
     */

    public static void main(String[] args) throws Exception {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        try{
        // Input for Player A
        System.out.println("Enter details for Player A:");
        System.out.print("Name: ");
        String nameA = scanner.next();
        System.out.print("Health: ");
        int healthA = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthA = scanner.nextInt();
        System.out.print("Attack: ");
        int attackA = scanner.nextInt();

        // Input for Player B
        System.out.println("Enter details for Player B:");
        System.out.print("Name: ");
        String nameB = scanner.next();
        System.out.print("Health: ");
        int healthB = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthB = scanner.nextInt();
        System.out.print("Attack: ");
        int attackB = scanner.nextInt();

        // Creating Player instances
        Player playerA = new Player(nameA, healthA, strengthA, attackA);
        Player playerB = new Player(nameB, healthB, strengthB, attackB);
        
        // Creating MagicalArena instance
        MagicalArena magicalArena = new MagicalArena(playerA, playerB, 6);
        magicalArena.playGame();

    } finally {
         // Close the Scanner to prevent resource leak
        scanner.close();
    }
    }
}
