package com.LeahGrace.Udemy.InterviewPractiveAlgorithms;

public class Equilibrium {

    public static int returnAbsoluteLeftRight(int[] arr){

        int leftTrav = 0;
        int rightTrav = arr.length - 1;

        int left = arr[leftTrav];
        int right = arr[rightTrav];

        System.out.println("The left is " + left);
        System.out.println("The right is " + right);



        while (leftTrav < rightTrav) {

            System.out.println("The left trav starts at " + leftTrav);

            System.out.println("The left would increase to " + (left + arr[leftTrav++]));
            System.out.println("The right would increase to " + (right + arr[rightTrav++]));
            System.out.println("");
            System.out.println("The left trav starts at " + leftTrav);

/*
            if (left < right) {
                leftTrav++;
                left += arr[leftTrav];
                System.out.println("The left is now " + left);
                break;
            }
            if (right < left) {
                rightTrav--;
                right += arr[rightTrav];
                break;
            }
 */
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
        int[] arr1 = {2, 3, 1, 5, 6, 1, 2, 1};
        int[] arr2 = {2, 4, 7, 8, 1, 5, 3};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(returnAbsoluteLeftRight(arr1));

    }

}
