package com.swiggy.assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for thePlayer class.
 */

public class PlayerTest {

    private Player player;

    /**
     * Set up a player instance before each test.
     */

    @BeforeEach
    public void setUp() {
        player = new Player("test", 50, 5,10);
    }

    /**
     * Test the takeDamage method.
     */

    @Test
    public void testTakeDamage() {
        // Assign the initial values
        int initialHealth = player.getHealth();
        int damage = 10;

        // Calculate the remaining health after the damage
        player.takeDamage(damage);
        int actualHealth = player.getHealth();

        // Calculate the expected remaining health after the damage
        int expectedHealth = (initialHealth - damage < 0? 0: initialHealth - damage);
        

        // Compare the actual health with the expected remaining health after the damage
        assertEquals(expectedHealth, actualHealth);
    }
}

