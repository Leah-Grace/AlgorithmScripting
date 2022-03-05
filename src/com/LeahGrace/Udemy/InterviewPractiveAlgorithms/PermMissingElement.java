package com.LeahGrace.Udemy.InterviewPractiveAlgorithms;

import java.util.Arrays;

public class PermMissingElement {

    public static int solution(int[] A){
        long actualSum = 0;
        for (int number : A){
            actualSum += number;
        }
        long maxNumber = A.length + 1;
        long expectedSum = (maxNumber * (maxNumber + 1) / 2);

        return (int)(expectedSum - actualSum);

    }

    public static int returnMissingElementWithSort(int[] arr) {
        //values in sorted array are [1, n+1]
        System.out.print("Array ");
        displayArr(arr);
        //sort the array
        Arrays.sort(arr);
        displayArr(arr);
        int sequentialValues = 1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != sequentialValues)
                return arr[i - 1] + 1;
            sequentialValues++;
        }
        return 0;
    }

    public static int returnMissingElement(int[] arr){
        //receive unsorted array
        // create a second array of n+1
        //loop through
        int sequentialValue = 0;


        int[] temp = new int[arr.length + 2];
        for (int i : arr){
            temp[i] = i;
        }

        System.out.println("The temp array is ");
        displayArr(temp);

        for (int i : temp){
            if (i != sequentialValue) {
                return sequentialValue;
            }
            sequentialValue++;
        }


        return 0;
    }



    public static void displayArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        return;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 5};
        int[] arr2 = {2, 4, 7, 8, 1, 5, 3};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //System.out.println(returnMissingElementWithSort(arr1) + " Must return 4");
        //System.out.println(returnMissingElement(arr1) + " Must return 4");
        // System.out.println(returnMissingElementWithSort(arr2) + " Must return 6");
        //System.out.println(returnMissingElement(arr2) + " Must return 6");
        System.out.println(solution(new int[]{2, 3, 1, 5}));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(solution(new int[]{}));
    }
}