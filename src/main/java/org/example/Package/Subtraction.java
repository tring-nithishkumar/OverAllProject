package org.example.Package;

class Subtraction extends Calculation{
    Subtraction(double r, double y) {
        super(r, y);
    }
    String calc(){
        result = result - n2;
        return String.valueOf(result);
    }
}