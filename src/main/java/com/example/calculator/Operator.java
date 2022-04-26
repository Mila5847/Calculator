package com.example.calculator;

public abstract class Operator implements Token {
    @Override
    public boolean isOperand(Token token) {
        return false;
    }

    abstract public Operand evaluate(Operand op1, Operand op2);

}
