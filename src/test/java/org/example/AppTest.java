package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    double num1 = 10;
    double num2 = 2;

    @Test // test addition
    public void testAddReturnExpectedResult() {
        String choice = "+";
        double expected = 12;
        double result = App.calculator(choice, num1, num2);
        Assert.assertTrue(expected == result);
    }

    @Test // test subtraction
    public void testMinusReturnExpectedResult(){
        String choice = "-";
        double expected = 8;
        double result = App.calculator(choice, num1, num2);
        Assert.assertTrue(expected == result);
    }

    @Test // test multiplication
    public void testMultiplyReturnExpectedResult(){
        String choice = "*";
        double expected = 20;
        double result = App.calculator(choice, num1, num2);
        Assert.assertTrue(expected == result);
    }

    @Test // test division
    public void testDivideReturnExpectedResult(){
        String choice = "/";
        double expected = 5;
        double result = App.calculator(choice, num1, num2);
        Assert.assertTrue(expected == result);
    }
}
