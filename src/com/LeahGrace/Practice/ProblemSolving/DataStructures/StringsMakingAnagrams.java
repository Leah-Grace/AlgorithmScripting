package com.LeahGrace.Practice.ProblemSolving.DataStructures;

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

public class StringsMakingAnagrams {

    public static int makeAnagram(String a, String b) {
        // declare/instantiate int to return (count of deletions)
        int deletionCount = 0;
        //Instantiate Hashmap
        HashMap charMapA = new HashMap<Character, Integer>();
        HashMap charMapB = new HashMap<Character, Integer>();
        //Iterate over characters in string a and populate Map
        for (char character : a.toCharArray()){
            if (!charMapA.containsKey(character)){
                charMapA.put(character, 1);
            } else {
                charMapA.put(character, (int)charMapA.get(character) + 1);
            }
        }
        //Iterate over characters in string b and populate Map
        for (char character : b.toCharArray()){
            if (!charMapB.containsKey(character)){
                charMapB.put(character, 1);
            } else {
                charMapB.put(character, (int)charMapB.get(character) + 1);
            }
        }
        //Combine strings into Set
        String charString = a + b;
        Set<Character> charsSet = charString.chars().mapToObj(e->(char)e).collect(Collectors.toSet());

        //Iterate over set of chars and increment deletion count
        for (char c : charsSet){
            if(charMapA.containsKey(c) && charMapB.containsKey(c)){ //if c is in BOTH Maps
                // System.out.println(c);
                if (charMapA.get(c) == charMapB.get(c)){
                    //System.out.println(c + " has equal values");
                } else {
                    int charDifferential = Math.abs((int)charMapA.get(c) - (int)charMapB.get(c));
                    deletionCount += charDifferential;
                    // System.out.println(c + " has unequal values " + charDifferential);
                }
            } else {
                //System.out.println(c + "is in one Map or another");
                if (charMapA.containsKey(c)){
                    deletionCount += (int)charMapA.get(c);
                } else {
                    deletionCount += (int)charMapB.get(c);
                }
            }
        }
        return deletionCount;

    }




    public static void main(String[] args) {

        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int res = makeAnagram(a, b);

        System.out.println(res);

    }

}