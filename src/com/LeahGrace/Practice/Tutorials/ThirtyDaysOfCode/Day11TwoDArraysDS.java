package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Day11TwoDArraysDS {


    class Result {

        public static int hourglassSum(List<List<Integer>> arr) {
            // Write your code here
            int maxSum = 0;
            Integer tempSum = 0;
            ArrayList<Integer> sumsList = new ArrayList<Integer>(16);

            for (int i = 0; i < arr.size() - 2; i++){
                for (int j = 0; j < arr.get(i).size() - 2; j++){
                    tempSum += arr.get(i + 1).get(j + 1);

                    for (int k = 0; k < 3; k++){
                        tempSum += arr.get(i).get(j + k);
                        tempSum += arr.get(i+2).get(j + k);
                    }
                    int[] sums = new int[16];
                    sumsList.add(tempSum);
                    System.out.println("tempSum is " + tempSum);
                    if (tempSum > maxSum){
                        maxSum = tempSum;
                    }
                    tempSum = 0;
                }
            }
            return Collections.max(sumsList);
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, 6).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int result = Result.hourglassSum(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}


/*

TEST CASE 3

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5



TEST CASE 7

0 -4 -6 0 -7 -6
-1 -2 -6 -8 -3 -1
-8 -4 -2 -8 -8 -6
-3 -1 -2 -5 -7 -4
-3 -5 -3 -6 -6 -6
-3 -6 0 -8 -6 -7
 */