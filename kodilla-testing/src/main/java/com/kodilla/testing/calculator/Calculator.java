package com.kodilla.testing.calculator;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
         int sum = a + b;
         return sum;
    }
    public int subtract(){
        if( a > b){
              int difference = a - b;
              return difference;
        } else if( a == b){
            return 0;
        } else {
            int difference =  b - a;
            return difference;
        }
    }
}
