package com.example.calculator;

public class Addition extends Operator{
    @Override
    public boolean isOperand() {
        return false;
    }

    @Override
    public Operand evaluate(Operand op1, Operand op2){
        double sum = op1.value + op2.value;
        Operand result = new Operand(sum);
        return result;
    }
}
