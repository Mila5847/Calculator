package com.example.calculatorjavafx;

import com.example.calculator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    // Addition
    @Test
    public void
    AdditionEvaluate_TwoPositiveOperands_AddTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),5);
    }
    @Test
    public void AdditionEvaluate_TwoNegativeOperands_AddTheNumbers(){
        Operand op1 = new Operand(-2);
        Operand op2 = new Operand(-3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-5);
    }
    @Test
    public void AdditionEvaluate_OneNegativeAndOnePositiveOperand_AddTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(-3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-1);
    }

    // Subtraction
    @Test
    public void
    SubtractionEvaluate_TwoPositiveOperands_SubtractTheNumbers(){
        Operand op1 = new Operand(5);
        Operand op2 = new Operand(2);
        Subtraction subtraction = new Subtraction();
        Operand result = subtraction.evaluate(op1, op2);
        assertEquals(result.getValue(),3);
    }
    @Test
    public void
    SubtractionEvaluate_TwoNegativeOperands_SubtractTheNumbers() {
        Operand op1 = new Operand(-5);
        Operand op2 = new Operand(-2);
        Subtraction subtraction = new Subtraction();
        Operand result = subtraction.evaluate(op1, op2);
        assertEquals(result.getValue(), -3);
    }
    @Test
    public void
    SubtractionEvaluate_OneNegativeAndOnePositiveOperand_SubtractTheNumbers() {
        Operand op1 = new Operand(-5);
        Operand op2 = new Operand(2);
        Subtraction subtraction = new Subtraction();
        Operand result = subtraction.evaluate(op1, op2);
        assertEquals(result.getValue(), -7);
    }

    // Multiplication
    @Test
    public void
    MultiplicationEvaluate_TwoPositiveOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(4);
        Operand op2 = new Operand(2);
        Multiplication multiplication = new Multiplication();
        Operand result = multiplication.evaluate(op1, op2);
        assertEquals(result.getValue(),8);
        assertNotNull(result);
    }
    @Test
    public void
    MultiplicationEvaluate_TwoNegativeOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(-4);
        Operand op2 = new Operand(-2);
        Multiplication multiplication = new Multiplication();
        Operand result = multiplication.evaluate(op1, op2);
        assertEquals(result.getValue(),8);
        assertNotNull(result);
    }
    @Test
    public void
    MultiplicationEvaluate_OneNegativeAndOnePositiveOperand_MultiplyTheNumbers(){
        Operand op1 = new Operand(4);
        Operand op2 = new Operand(-2);
        Multiplication multiplication = new Multiplication();
        Operand result = multiplication.evaluate(op1, op2);
        assertEquals(result.getValue(),-8);
        assertNotNull(result);
    }

    // Division
    @Test
    public void
    DivisionEvaluate_TwoPositiveOperands_DivideTheNumbers(){
        Operand op1 = new Operand(12);
        Operand op2 = new Operand(4);
        Division division = new Division();
        Operand result = division.evaluate(op1, op2);
        assertEquals(result.getValue(), 3);
        assertNotNull(result);
        boolean isGreaterThanZero = false;
        if(result.getValue() >= 0){
            isGreaterThanZero = true;
        }
        assertTrue(isGreaterThanZero);
    }
    @Test
    public void
    DivisionEvaluate_TwoNegativeOperands_DivideTheNumbers(){
        Operand op1 = new Operand(-12);
        Operand op2 = new Operand(-4);
        Division division = new Division();
        Operand result = division.evaluate(op1, op2);
        assertEquals(result.getValue(), 3);
        assertNotNull(result);
    }
    @Test
    public void
    DivisionEvaluate_OneNegativeAndOnePositiveOperand_DivideTheNumbers(){
        Operand op1 = new Operand(-12);
        Operand op2 = new Operand(4);
        Division division = new Division();
        Operand result = division.evaluate(op1, op2);
        assertEquals(result.getValue(), -3);
        assertNotNull(result);
    }
}
