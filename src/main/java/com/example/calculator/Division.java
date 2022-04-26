package com.example.calculator;

public class Division extends Operator{
    @Override
    public boolean isOperand() {
        return false;
    }

    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double divide = op1.value / op2.value;
        Operand result = new Operand(divide);
        return result;
    }
}
