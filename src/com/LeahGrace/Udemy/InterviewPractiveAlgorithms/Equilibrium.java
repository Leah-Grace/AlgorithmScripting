package com.LeahGrace.Udemy.InterviewPractiveAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Equilibrium {

    public static int returnAbsoluteLeftRight(Integer[] arr){

        List<Integer> List = Arrays.asList(arr);
        Integer sum = List.stream().reduce(0, Integer::sum);



        return sum;
    }


    public static void displayArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        return;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2, 3, 1, 5, 6, 1, 2, 1};
        Integer[] arr2 = {2, 4, 7, 8, 1, 5, 3};
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(returnAbsoluteLeftRight(arr1));

    }

}
