package com.pasindu.java.exception.trycatch.unit1;

public class Example1 {
    public static int divideTwoNumbers(int a, int b) throws CustomException {
        if(b==0)
            throw new CustomException("Second value can not be Zero !");
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println("Value : "+divideTwoNumbers(a,b));
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Bye !");
    }
}
