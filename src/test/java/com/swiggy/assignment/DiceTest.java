package com.swiggy.assignment;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Unit tests for the Dice class using Mockito for mocking the Random object.
 */

@ExtendWith(MockitoExtension.class)
public class DiceTest {

    // Mock the Random object
    @Mock
    private Random random;

    /**
     * Tests the roll method of the Dice class.
     */

    @Test
    public void testRoll() {
        // Create an instance of Dice with the mocked Random object
        Dice dice = new Dice(random,6);

        // Mock the behavior of random.nextInt() to return a specific value (e.g., 3)
        when(random.nextInt(Mockito.anyInt())).thenReturn(3);

        // Call the roll method
        int result = dice.roll();

        // Verify that the result is the expected value 
        assertEquals(4, result);
    }
}
