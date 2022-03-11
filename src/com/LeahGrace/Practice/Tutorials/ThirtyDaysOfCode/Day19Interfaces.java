package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}
class InterfacesCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisors = 0;
        for (int i = n; i > 0; i--){
            if ((n % i) == 0){
                //System.out.println("Divisor found : " + i);
                divisors += i;
            }
        }
        return divisors;
    }
}


public class Day19Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  25;   // scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new InterfacesCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}