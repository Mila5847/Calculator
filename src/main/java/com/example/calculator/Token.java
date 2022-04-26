package com.example.calculator;

public interface Token {
    //one abstract method called isOperand and returns boolean.
    public abstract boolean isOperand();

    boolean isOperand(Token token);
}
