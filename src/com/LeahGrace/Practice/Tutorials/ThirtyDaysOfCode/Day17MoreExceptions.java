package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.util.*;

class Calculator extends Throwable {
    //Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.
    static int power(int x, int y) throws Exception{
        int calculation;
        if (x < 0 || y < 0){
            System.out.println("n and p should be non-negative");
            throw new Exception("n and p should be non-negative");

        } else {
            calculation = (int)Math.pow(x, y);
        }
        return calculation;
    }
}

public class Day17MoreExceptions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
            String[] numbers = scan.nextLine().split(" ");
            if (numbers.length > 1){
                int num = Integer.parseInt(numbers[0]);
                int toThePowerOf = Integer.parseInt(numbers[1]);
                try {
                    System.out.println(Calculator.power(num, toThePowerOf));
                } catch (Exception e){
                    System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
                }
            }
        }
        scan.close();

    }
}
