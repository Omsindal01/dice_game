package com.swiggy.assignment;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

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

        MagicalArena magicalArena = new MagicalArena(playerA, playerB, 6);
        magicalArena.playGame();
    }
}
