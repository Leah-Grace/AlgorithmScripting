package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

public class Day25RunningTimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String determination = "Not prime";
        //ArrayList<String> results = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases-- > 0){
            int num = scan.nextInt();
            double sqrt = Math.sqrt(num);
            System.out.println(sqrt);

            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    System.out.println(num + " % " + i + " is " + (num % i));
                    determination = "Not prime";
                    // System.out.println(determination);
                    //continue;
                }
            }
            System.out.println(determination);
        }

    }
}

/*

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    /*
String determination = "Prime";
    ArrayList<String> results = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();

        while (testCases-- > 0){
                int num = scan.nextInt();
                // System.out.println(num);
                if (num == 1){
                determination = "Not prime";
                continue;
                }
                int sqrt = (int)Math.sqrt(num);
                System.out.println("Number " + num + " Square Root of " + sqrt);

                if (num % sqrt == 0){
                determination = "Not prime";
                continue;
                }

                for (int i = 2; i < sqrt; i++){

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

 */
