package com.swiggy.assignment;

/**
 * The {@code Player} class represents a player in the game.
 * It encapsulates attributes such as health, strength, attack, and name.
 */

public class Player {
    private int health;
    private int strength;
    private int attack;
    private String name;

    /**
     * Constructs a new player with the specified attributes.
     *
     * @param name     The name of the player.
     * @param health   The initial health of the player.
     * @param strength The strength attribute of the player.
     * @param attack   The attack attribute of the player.
     */

    public Player(String name,int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    /**
     * Gets the current health of the player.
     *
     * @return The health of the player.
     */

    public int getHealth() {
        return health;
    }

    /**
     * Gets the strength attribute of the player.
     *
     * @return The strength value of the player.
     */

    public int getStrength() {
        return strength;
    }

    /**
     * Gets the attack attribute of the player.
     *
     * @return The attack value of the player.
     */

    public int getAttack() {
        return attack;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */

    public String getName() {
        return name;
    }

    /**
     * Inflicts damage to the player based on the specified amount.
     * Updates the player's health and ensures it does not go below zero.
     *
     * @param damage The amount of damage to be inflicted.
     */

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    /**
     * Checks whether the player is alive.
     *
     * @return {@code true} if the player's health is greater than zero, {@code false} otherwise.
     */
    
    public boolean isAlive() {
        return health > 0;
    }
}