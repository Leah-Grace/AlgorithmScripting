package com.LeahGrace;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        TreeMap<Integer, Integer> birds = new TreeMap<>(Map.of(1, 0, 2, 0, 3, 0, 4, 0, 5, 0));
        for (Integer birdCount : arr){
                birds.put(birdCount, birds.get(birdCount) + 1);
        }
        int max = Collections.max(birds.values());

        for (Integer key : birds.keySet()){
            if (birds.get(key) == max){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> birdArray = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        int result =  migratoryBirds(birdArray);
        System.out.println(result);


    }
}
