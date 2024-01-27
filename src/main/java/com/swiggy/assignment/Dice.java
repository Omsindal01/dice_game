package com.swiggy.assignment;
import java.util.Random;

/**
 * The {@code Dice} class represents a six-sided dice used in the game.
 * It provides a method to roll the dice and get a random outcome.
 */

 public class Dice {
    private Random random;  // Random number generator
    private int sides;      // Number of sides on the dice

    /**
     * Constructs a new six-sided dice with a default random number generator.
     * 
     * @param sides The number of sides on the dice.
     */

    public Dice(int sides) {
        this.random = new Random();
        this.sides = sides;
    }

    /**
     * Constructor for Unit testing.
     * Constructs a new dice with a mock random number generator and
     * the number of sides.
     * 
     * @param random The random number generator to be used.
     * @param sides The number of sides on the dice.
     */

    public Dice(Random random, int sides){
        this.random = random;
        this.sides = sides;
    }

    /**
     * Rolls the dice and returns a random outcome between 1 and the number of sides.
     * 
     * @return The result of rolling the dice.
     */
    
    public int roll() {
        return random.nextInt(sides) + 1;
    }
}

