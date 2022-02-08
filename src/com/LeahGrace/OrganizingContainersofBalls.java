package com.LeahGrace;

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

public class OrganizingContainersofBalls {
    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        String result = "Possible";
        Map capacityMap = new HashMap<Integer, Integer>();
        //iterate over arrays to count container capacities
        for (int i = 0; i < container.size(); i++) {
            int containerCapacity = 0;
            for (int j = 0; j < container.get(i).size(); j++) {
                containerCapacity += container.get(i).get(j);
            }
            if (capacityMap.containsKey(containerCapacity)) {
                capacityMap.put(containerCapacity, ((int) capacityMap.get(containerCapacity) + 1));
            } else {
                capacityMap.put(containerCapacity, 1);
            }
        }
        //iterate over arrays to calculate ball inventories
        for (int k = 0; k < container.size(); k++) {
            int ballInventory = 0;
            for (int l = 0; l < container.size(); l++) {
                ballInventory += container.get(l).get(k);
            }
            //evaluate whether or not the ballInventory matches any containerCapacity recorded in the HashMap<>
            if (capacityMap.containsKey(ballInventory) && (int) capacityMap.get(ballInventory) > 0) ///// *****Is (int)capacityMap.get(ballInventory) necessary (NOT REALLY). ---> WHERE ARE FREQUENCIES >1 ACCOUNTED FOR?
            {
                capacityMap.put(ballInventory, (int) capacityMap.get(ballInventory) - 1);
            } else {
                result = "Impossible";
            }
        }
        System.out.println(capacityMap);
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(new Integer[] {0,2}));
        list.add(Arrays.asList(new Integer[] {1,1}));
        System.out.println(organizingContainers(list)); //call the method, not the class
    }
}


