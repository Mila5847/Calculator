package com.example.calculator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PostfixEvaluator {
    // Attributes
    private ArrayList<Token> expression = new ArrayList<>();

    public void addToken(Token t)
    {
        expression.add(t);
    }
    
    public double evaluate(){
        if(expression.isEmpty()){
            throw new NoSuchElementException("The equation is empty.");
        }
        ArrayDeque <Operand> operands = new ArrayDeque<>();
        for(Token t : expression){
            if (t.isOperand()) {
                operands.push((Operand) t);
            }
            else {
                if (operands.size() < 2) {
                    throw new ArithmeticException("The arithmetic operation cannot be executed. There is less " +
                            "than 2 operands");
                }

                Operator operator = (Operator) t;
                Operand op1 = operands.pop();
                Operand op2 = operands.pop();
                Operand result = operator.evaluate(op1, op2);
                operands.push(result);
            }
        }
        if(operands.size() > 1){
            throw new ArithmeticException("There is more than one operand left.");
        }
        return operands.getLast().getValue();
    }
}
