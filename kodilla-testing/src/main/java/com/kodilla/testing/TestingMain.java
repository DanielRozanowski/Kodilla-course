package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

       /* SimpleUser user = new SimpleUser("theForumUser");

        String result = user.getUserName();

        if(result.equals("theForumUser")){
            System.out.println("testOK");
        } else {
            System.out.println("error?");
        } */

        Calculator numbers = new Calculator(10, 20);

        Integer result = numbers.add();
        Integer result2 = numbers.subtract();

        if(result.equals(30)){
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

        if(result2.equals(10)){
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }
}
