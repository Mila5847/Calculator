package com.example.calculator;

public class Multiplication extends Operator{
    @Override
    public boolean isOperand() {
        return false;
    }

    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double multiplication = op1.value * op2.value;
        Operand result = new Operand(multiplication);
        return result;
    }
}
