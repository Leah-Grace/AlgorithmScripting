package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

public class Day25RunningTimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String determination = "Not prime";
        ArrayList<String> results = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases-- > 0){
            int num = scan.nextInt();
            System.out.println(num);

            determination = "Prime";

            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    // System.out.println(num + " % " + i + " is " + (num % i));
                    determination = "Not prime";
                    // System.out.println(determination);
                    //continue;
                }
            }
            System.out.println(determination);
        }

    }
}

