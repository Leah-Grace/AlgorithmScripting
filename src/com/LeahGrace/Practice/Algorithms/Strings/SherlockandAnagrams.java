package com.LeahGrace.Practice.Algorithms.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SherlockandAnagrams {
    public static void findPermutations(String str) {
        //base case
        if (str == null || str.length() == 0){
            return;
        }
        //empty ArrayList to store (partial) permutations
        List<String> partial = new ArrayList<>();

        //initialize the list with the first character of the string
        partial.add(String.valueOf(str.charAt(0)));

        //for every character of the specified string
        for (int i = 1; i < str.length(); i++){
            //consider previously constructed partial permutation one by one
            // (iterate backward to avoid ConcurrentModificationException)
            for (int j = partial.size() - 1; j >= 0; j--) {
                // remove current partial permutation from the ArrayList
                String s = partial.remove(j);
                //Insert the next character of the specified string at all possible positions of current partial permutation
                //The insert each newly constructed string in the list.
                for (int k = 0; k <= s.length(); k++){
                    //concatenate string with StringBuilder?
                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
        System.out.println(partial);
    }
    
    private static void anagramPairCount(String str){
        HashMap<String, Integer> anagramPairMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            for (int j = i; j < str.length(); j++){
                char[] charArray = str.substring(i, j+1).toCharArray();
                Arrays.sort(charArray);
                String val = new String(charArray);
                if (anagramPairMap.containsKey(val))
                    anagramPairMap.put(val, anagramPairMap.get(val) + 1);
                else
                    anagramPairMap.put(val, 1);
            }
        }
        int anagramPairCount = 0;
        for (String key: anagramPairMap.keySet()){
            int n = anagramPairMap.get(key);
            anagramPairCount += (n * (n - 1))/2;
        }
        System.out.println(anagramPairCount);
    }
    public static void main(String[] args){
        String str = "kkkk";
       // findPermutations(str);
        anagramPairCount(str);
    }
}
