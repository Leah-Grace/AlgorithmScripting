package com.LeahGrace.Udemy.InterviewPractiveAlgorithms;

import java.util.Arrays;
import java.util.List;

public class Equilibrium {

    public static int returnAbsoluteLeftRight(Integer[] arr){

        List<Integer> List = Arrays.asList(arr);  // Convert Integer array to List of Integers
        int sum = List.stream().reduce(0, Integer::sum);  //  Calculate sum of all Integers

        int pointer = 0;  //pointer to iterate over array
        int leftSum = 0;  //accumulation  of values left of pointer
        int smallestABV = sum;  //Declare smallestABV and initialize to the sum of all integers in arr (the highest possible value)

        while (pointer < arr.length) {
            leftSum += arr[pointer];

            int thisABV = Math.abs(sum - (2 * leftSum));  //  Calculate an absolute value for the specific instance of each pointer. Use the formula: absolute value of 2x the sum of the Integers to the left of the pointer.

            if (thisABV < smallestABV){
                smallestABV = thisABV;  // If the calculated abv is less than all other abv's then reassign
            }
            pointer++;  // Increment pointer

        }

        return smallestABV;
    }


//    public static void displayArr(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + ", ");
//        }
//        System.out.println("");
//        return;
//    }

    public static void main(String[] args) {
        Integer[] arr1 = {2, 3, 1, 5, 6, 1, 2, 1};
        Integer[] arr2 = {2, 4, 7, 8, 1, 5, 3};
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] codilityExample = {3, 1, 2, 4, 3};

       // System.out.println(returnAbsoluteLeftRight(arr1));
        System.out.println(returnAbsoluteLeftRight(codilityExample));

        System.out.println(returnAbsoluteLeftRight(arr1));
        System.out.println(returnAbsoluteLeftRight(arr2));
        System.out.println(returnAbsoluteLeftRight(arr3));



    }

}
