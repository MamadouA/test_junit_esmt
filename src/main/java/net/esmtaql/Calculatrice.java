package net.esmtaql;

public class Calculatrice {

    public int add(int a, int b){
        return a + b;
    }

    public int soustraire(int a, int b){
        return a - b;
    }

    public int multiplier(int a, int b){
        return a * b;
    }

    public int diviser(int a, int b){

        if(b == 0){
            throw new ArithmeticException("Exception Division par zéro ");
        }
        return a / b;
    }
}

