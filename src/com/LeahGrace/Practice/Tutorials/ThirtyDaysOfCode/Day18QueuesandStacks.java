package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.io.*;
import java.util.*;


     class Day18QueuesAndStacks {
        public LinkedList stack = new LinkedList();
        public LinkedList queue = new LinkedList();

        // is queue empty
        public boolean isEmpty(){
            return queue.isEmpty();
        }
        // is stack empty
        public boolean isStackEmpty(){
            return stack.isEmpty();
        }
        // return queue size
        public int size(){
            return queue.size();
        }
        //return stack size
        public int stackSize(){
            return stack.size();
        }
        //enqueue char
        public void enqueueChar(char c){
            queue.addLast(c);
        }
        //add to stack
        public void addStack(char c){
            stack.addLast(c);
        }
        // queue - FIFO Behavior
        public char dequeue(){
            return (char)queue.remove(0);
        }
        // stack - LIFO Behavior
        public char stackRemoveLast(){
            return (char)stack.removeLast();
        }
        // Queue peek at FIRST item
        public char peek(){
            return (char)queue.get(0);
        }
        //Stack peek at LAST item
        public char stackPeek(){
            return (char)stack.peekLast();
        }


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         //   Scanner scan = new Scanner(System.in);
       //     String input = scan.nextLine();
        //    scan.close();

            //Convert input String to an array of characters:
         //   char[] s = input.toCharArray();

            char[] s = {'r', 'a', 'c', 'e', 'c', 'a', 'r', 'd'};
            String inputString = new String(s);

            // Create solution object
            Day18QueuesAndStacks isPalindrome = new Day18QueuesAndStacks();

            for (char character:s){

                isPalindrome.enqueueChar(character);
                isPalindrome.addStack(character);
            }

            //iterate over queue to peek and remove chars
            boolean palindrome = true;
            for (char c : s){
                if (isPalindrome.peek() == isPalindrome.stackPeek()) {

                    isPalindrome.dequeue();

                    isPalindrome.stackRemoveLast();
                } else {
                    palindrome = false;
                }
            }
            //check if queue is empty
            System.out.println("Queue empty?" + isPalindrome.isEmpty());
            System.out.println("Stack empty? " + isPalindrome.isStackEmpty());
            System.out.println("Stack size " + isPalindrome.stackSize());

            System.out.println( "The word, " + inputString + ", is "
                    + ( (!palindrome) ? "not a palindrome." : "a palindrome." ) );
        }
    }



