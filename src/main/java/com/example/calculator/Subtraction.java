package com.example.calculator;

public class Subtraction extends Operator{
    @Override
    public boolean isOperand() {
        return false;
    }

    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double difference = op1.value - op2.value;
        Operand result = new Operand(difference);
        return result;
    }
}
