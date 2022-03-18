package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;


public class Day28RegexPatternsandIntroToDatabases {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            HashMap<String, String> emailMap = new HashMap<>();

            IntStream.range(0, N).forEach(NItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    String firstName = firstMultipleInput[0];

                    String emailID = firstMultipleInput[1];
                    emailMap.put(emailID, firstName);

                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();

            Iterator<Map.Entry<String, String>> hashMapIterator = emailMap.entrySet().iterator();
            ArrayList<String> names = new ArrayList<>();

            while (hashMapIterator.hasNext()){
                Map.Entry<String, String> mapElement = hashMapIterator.next();
                String currentElement = mapElement.getKey();
                if (currentElement.startsWith("@gmail.com", currentElement.length() - 10)){
                    names.add(mapElement.getValue());
                }
            }
            names.sort(String::compareToIgnoreCase);
            for (String name : names){
                System.out.println(name);
            }
        }
    }

/*

TEST CASE:
6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
 */