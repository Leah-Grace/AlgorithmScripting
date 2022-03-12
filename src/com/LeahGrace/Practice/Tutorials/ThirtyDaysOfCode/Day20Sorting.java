package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

public class Day20Sorting {
}

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int swaps = 0;

        for (int i : a){
            System.out.println(i);
        }

        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("First Element: " + a.get(a.size() - 1));




        bufferedReader.close();
    }
}
