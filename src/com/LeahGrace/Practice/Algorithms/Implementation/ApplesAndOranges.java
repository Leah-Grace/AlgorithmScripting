package com.LeahGrace.Practice.Algorithms.Implementation;

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

public class ApplesAndOranges {

    class Result {

        public static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree, List<Integer> apples, List<Integer> oranges) {

            int appleCount = 0;
            int orangeCount = 0;

            for (int apple : apples){
                if (appleTree + apple >= houseStart && appleTree + apple <= houseEnd)
                    appleCount++;
            }
            for (int orange : oranges){
                if (orangeTree + orange >= houseStart && orangeTree + orange <= houseEnd)
                    orangeCount++;
            }
            System.out.println(appleCount);
            System.out.println(orangeCount);

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int s = Integer.parseInt(firstMultipleInput[0]);

            int t = Integer.parseInt(firstMultipleInput[1]);

            String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int a = Integer.parseInt(secondMultipleInput[0]);

            int b = Integer.parseInt(secondMultipleInput[1]);

            String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int m = Integer.parseInt(thirdMultipleInput[0]);

            int n = Integer.parseInt(thirdMultipleInput[1]);

            List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.countApplesAndOranges(s, t, a, b, apples, oranges);

            bufferedReader.close();
        }
    }

}
