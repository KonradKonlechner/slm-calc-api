package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test
    public void addTwoPositiveIntegers(){
        // Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = 6;
        // Act
        int result = controller.add(a, b);
        // Assert
        assertEquals(11, result);
    }

    @Test
    public void addOnePositiveAndOneNegativeInteger(){
        // Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = -6;
        // Act
        int result = controller.add(a, b);
        // Assert
        assertEquals(-1, result);
    }

    @Test
    public void addTwoNegativeIntegers(){
        // Arrange
        CalculatorController controller = new CalculatorController();
        int a = -5;
        int b = -6;
        // Act
        int result = controller.add(a, b);
        // Assert
        assertEquals(-11, result);
    }
}