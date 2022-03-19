package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

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

public class Day29BitwiseAND {

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        ArrayList<Integer> S = new ArrayList<>();
        int maxAB = 0;

        for (int i = 1; i <= N; i++){
            S.add(i);
        }
        for (int a : S){
            for (int b : S){
                if (a !=b && a < b){
                    System.out.println(a + " and " + b);
                    int c = a & b;
                    if (c < K && c > maxAB){
                        System.out.println("Bitwise :" + c);
                        maxAB = c;
                    }

                }
            }
        }
        System.out.println(S);
        return maxAB;

    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Day29BitwiseAND.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
