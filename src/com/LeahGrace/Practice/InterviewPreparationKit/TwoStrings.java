package com.LeahGrace.Practice.InterviewPreparationKit;

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

class Result {
    public static String twoStrings(String s1, String s2) {
        String determination = "YES";
        // Write your code here
        System.out.println(s1);
        HashMap<String, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++){
            for (int j = 1; j <= s1.length(); j++){
                //System.out.println(s1.substring(i,j));
                s1Map.put(s1.substring(i,j), 1);
            }
        }

        return determination;
    }

}

public class TwoStrings {
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
     */
    public static void main(String[] args) {
        Result.twoStrings("hello", "world");
        System.out.println("Here");
    }
}




