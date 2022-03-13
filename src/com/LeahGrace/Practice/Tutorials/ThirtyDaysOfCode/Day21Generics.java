package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;
import java.util.*;


public class Day21Generics {

    class Printer<T> {

        // Write your code here
        public static <E> void printArray(E[] arr) {
            for (E element : arr) {
                System.out.println(element);
            }
        }

    }

    public class Generics {

        public void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Integer[] intArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }

            n = scanner.nextInt();
            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = scanner.next();
            }

            Printer<Integer> intPrinter = new Day21Generics.Printer<Integer>();
            Printer<String> stringPrinter = new Day21Generics.Printer<String>();
            intPrinter.printArray(intArray);
            stringPrinter.printArray(stringArray);
            if (Printer.class.getDeclaredMethods().length > 1) {
                System.out.println("The Printer class should only have 1 method named printArray.");
            }
        }
    }
}