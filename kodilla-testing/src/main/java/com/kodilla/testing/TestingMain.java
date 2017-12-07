package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test theForumUser OK");
        } else {
            System.out.println("the Forumuser error!");
        }

        //testowanie klasy Calculator

        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 7);
        int subtractResult = calculator.subtract(10, 7);

        if(addResult == 17) {
            System.out.println("test add OK");
        } else {
            System.out.println("add error!");
        }

        if(subtractResult == 3) {
            System.out.println("test subtract OK");
        } else{
            System.out.println("subtract error!");
        }

    }
}
