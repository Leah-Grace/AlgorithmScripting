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

public class JumpingOnClouds {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int maxCloudIndexes = c.size();
        int jumpCount = 0;


        for (int cloudIndex = 0; cloudIndex < maxCloudIndexes - 1; cloudIndex++){
            System.out.println("Cloud position starts at " + cloudIndex + " with value of " + c.get(cloudIndex));
            int doubleJump = (cloudIndex + 2);
            if ((doubleJump) < maxCloudIndexes && c.get(doubleJump) == 0){
                System.out.println("Cloud can move to " + (cloudIndex + 2) + " with value of " + c.get(cloudIndex + 2));
                cloudIndex++;
            }
            jumpCount++;
        }
        return jumpCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = JumpingOnClouds.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}