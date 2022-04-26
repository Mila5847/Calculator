package com.example.calculator;

public final class Operand implements Token{

    //Attributes
    double value;

    // Constructor
    public Operand(double value){
        this.value = value;
    }

    // Getter
    public double getValue(){
        return this.value;
    }

    @Override
    public boolean isOperand() {
        return true;
    }

    @Override
    public boolean isOperand(Token token) {
        return false;
    }
}
