package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class CalculationTest
{

    @Test
    public void findMaxTest()
    {
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
        assertEquals(6,Calculation.findMax(new int[]{0,2,4,6}));
    }
    @Test
    public void findminTest()
    {
        assertEquals(0,Calculation.findMin(new int[]{2,3,4,0}));
        assertEquals(7,Calculation.findMin(new int[]{ 33,61,7,77}));
    }
    @Test
    public void cubeTest()
    {
        assertEquals(27,Calculation.cube(3));
    }
}