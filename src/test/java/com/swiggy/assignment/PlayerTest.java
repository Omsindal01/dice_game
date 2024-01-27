package com.swiggy.assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("test", 50, 5,10);
    }

    @Test
    public void testTakeDamage() {
        // Arrange
        int initialHealth = player.getHealth();
        int damage = 10;

        // Act
        player.takeDamage(damage);

        int expectedHealth = (initialHealth - damage < 0? 0: initialHealth - damage);
        int actualHealth = player.getHealth();

        // Assert
        assertEquals(expectedHealth, actualHealth);
    }
}

