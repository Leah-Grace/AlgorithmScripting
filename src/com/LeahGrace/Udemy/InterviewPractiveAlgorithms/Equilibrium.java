package com.LeahGrace.Udemy.InterviewPractiveAlgorithms;

import java.util.Arrays;
import java.util.List;
/*
public class Equilibrium {

    public static int solution(int[] A){
        int leftSum = A[0];
        int rightSum = 0;

        for (int num : A) rightSum += num;
       // System.out.println("The right sum is " + rightSum);
        rightSum -= leftSum;
       // System.out.println("The right sum less the left sum is " + rightSum);


        int diff = Math.abs(leftSum - rightSum);

      //  System.out.println("The diff starts at " + diff);

        for (int i = 1; i < A.length - 1; i++){
            leftSum += A[i];
            rightSum -= A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
           // System.out.println("The currentDiff is " + currentDiff);

            if(diff > currentDiff) diff = currentDiff;

        }


        return diff;
    }
/*
    public static int returnAbsoluteLeftRight(int[] arr){

        List<Integer> List = Arrays.asList(arr);  // Convert Integer array to List of Integers
        int sum = List.stream().reduce(0, Integer::sum);  //  Calculate sum of all Integers

        int pointer = 0;  //pointer to iterate over array
        int leftSum = 0;  //accumulation  of values left of pointer
        int smallestABV = Math.abs(sum);  //Declare smallestABV and initialize to the sum of all integers in arr (the highest possible value)

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

 */
/*
    public static void main(String[] args) {
        Integer[] arr1 = {2, 3, 1, 5, 6, 1, 2, 1};
        Integer[] arr2 = {2, 4, 7, 8, 1, 5, 3};
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] codilityExample = {-3, -1, -2, -4, -3};

       // System.out.println(returnAbsoluteLeftRight(arr1));
        System.out.println(returnAbsoluteLeftRight(codilityExample));
        System.out.println(solution(codilityExample));
*/
//        System.out.println(returnAbsoluteLeftRight(arr1));
//        System.out.println(returnAbsoluteLeftRight(arr2));
//        System.out.println(returnAbsoluteLeftRight(arr3));
/*
    }

}

*/


/*
********* CODILITY FEEDBACK ********

*
* simple_negative
simple test with negative numbers, length = 5✘WRONG ANSWER
got -27 expected 3
1.0.104 sWRONG ANSWER, got -27 expected 3
2.0.104 sWRONG ANSWER, got -10 expected 0
*

* !!!!!!!!! THERE MUST BE AN ISSUE WITH RETURNING SUMS THAT ARE NOT ABSOLUTE VALUES IF NEGATIVE NUMBERS ARE BEING SUBMITTED AS THE ANSWER.

 */