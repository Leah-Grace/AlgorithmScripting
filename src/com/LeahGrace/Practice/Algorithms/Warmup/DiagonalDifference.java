package com.LeahGrace.Practice.Algorithms.Warmup;

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

class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int abv = 0;
        int leftRight = 0;
        int rightLeft = 0;

        int ascendingIndex = 0; //increment by 1 each time
        int decendingIndex = (arr.size() - 1); //decriment by 1 each time

        for (int i = 0; i < arr.size(); i++){

            //System.out.println("Select from index [" + ascendingIndex + ", " + ascendingIndex + "] and [" + ascendingIndex + ", " + decendingIndex + "]");

            //System.out.println("Add ints : " + arr.get(ascendingIndex).get(ascendingIndex) + " and " + arr.get(ascendingIndex).get(decendingIndex));

            leftRight += arr.get(ascendingIndex).get(ascendingIndex);
            rightLeft += arr.get(ascendingIndex).get(decendingIndex);

            System.out.println("Accumulations " + leftRight + " and " + rightLeft);

            ascendingIndex++;
            decendingIndex--;

        }

        System.out.println("Calculate avb of " + leftRight + " and " + rightLeft);
        return Math.abs(leftRight - rightLeft);

    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
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

        int result = DiagonalDifference.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

