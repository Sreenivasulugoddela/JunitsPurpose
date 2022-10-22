package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class CalculatorTest
{

    Calculator calculator=new Calculator();
     @Test
     @DisplayName("Add two double values")
     public void addTest()
     {
         assertEquals(4, Calculator.add(2,2),4.0);
     }

    @Test
    @DisplayName("Multiply two numbers")
    public void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2),4.0),
                () -> assertEquals(-4, Calculator.multiply(2, -2),-4.0),
                () -> assertEquals(4, Calculator.multiply(-2, -2),4.0),
                () -> assertEquals(0, Calculator.multiply(1, 0),0.0));
    }
}