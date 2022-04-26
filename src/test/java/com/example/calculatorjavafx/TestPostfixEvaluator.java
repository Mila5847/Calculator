package com.example.calculatorjavafx;

import com.example.calculator.Addition;
import com.example.calculator.Multiplication;
import com.example.calculator.Operand;
import com.example.calculator.PostfixEvaluator;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestPostfixEvaluator {
    @Test
    public void PostfixEvaluator_CorrectExpression_EvaluateToANumber(){
        PostfixEvaluator evaluator = new PostfixEvaluator();
        evaluator.addToken(new Operand(3));
        evaluator.addToken(new Operand(2));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Operand(5));
        evaluator.addToken(new Addition());
        evaluator.addToken(new Operand(6));
        evaluator.addToken(new Operand(4));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Addition());
        assertEquals(evaluator.evaluate(), 35);
    }

    @Test
    public void
    PostfixEvaluator_ExpressionWithOneOperandOnlyAndOneOperator_ThrowsArithmeticException(){
        Exception exception = assertThrows(ArithmeticException.class, ()->{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.addToken(new Operand(3));
            evaluator.addToken(new Multiplication());
            evaluator.evaluate();
        });
        String expectedMessage = "The arithmetic operation cannot be executed. There is less " + "than 2 operands";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void PostfixEvaluator_ExpressionWithOneOperandOnly_ThrowsArithmeticException(){
        Exception exception = assertThrows(ArithmeticException.class, ()-> {
                    PostfixEvaluator evaluator = new PostfixEvaluator();
                    evaluator.addToken(new Operand(3));
                    evaluator.addToken(new Operand(2));
                    evaluator.addToken(new Multiplication());
                    evaluator.addToken(new Operand(4));
                    evaluator.evaluate();
        });
        String expectedMessage = "There is more than one operand left.";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void PostfixEvaluator_EmptyExpression_ThrowsNoSuchElementException(){
        Exception exception = assertThrows(NoSuchElementException.class, ()-> {
                    PostfixEvaluator evaluator = new PostfixEvaluator();
                    evaluator.evaluate();
        });
        String expectedMessage = "The equation is empty.";
        String actualMessage = exception.getMessage();
        //asserting the exception message if it contains
        //our expected message
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
