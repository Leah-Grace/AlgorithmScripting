package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;
import java.util.*;
import java.io.*;




public class Day22BinarySearchTrees {


      class Node{
            com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode.Node left,right;
            int data;
            Node(int data){
                  this.data=data;
                  left=right=null;
            }
      }

            public static int getHeight(Node root){
                  //Write your code here
                  int leftTree = 0;
                  int rightTree = 0;
                  Node current = root;

                  while (current.right != null){
                        rightTree++;
                        current = current.right;
                        // System.out.println(current.data);
                  }

                  current = root;

                  while(current.left !=null){
                        leftTree++;
                        current = current.left;
                  }
                  //System.out.println(root.left.data);
                  // System.out.println(root.right.data);

                  //System.out.println(rightTree);

                  if (leftTree >= rightTree){
                        return leftTree;
                  }

                  return rightTree;

            }

            public static Node insert(Node root,int data){
                  if(root==null){
                        return new Node(data);
                  }
                  else{
                        Node cur;
                        if(data<=root.data){
                              cur=insert(root.left,data);
                              root.left=cur;
                        }
                        else{
                              cur=insert(root.right,data);
                              root.right=cur;
                        }
                        return root;
                  }
            }
            public static void main(String args[]){
                  Scanner sc=new Scanner(System.in);
                  int T=sc.nextInt();
                  Node root=null;
                  while(T-->0){
                        int data=sc.nextInt();
                        root=insert(root,data);
                  }
                  int height=getHeight(root);
                  System.out.println(height);
            }
      }
















/* Previous solution

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Read input from STDIN.
        //Print output to STDOUT.

       Scanner scan = new Scanner(System.in);
       int root = scan.nextInt();
       /
 */
      /* ArrayList<Integer> intList = new ArrayList<Integer>();
      for (int i = 0; i < root; i++){
          intList.add(scan.nextInt());
      }
     // System.out.println(intList);
      */
      /*
double h = ((Math.log10(root + 1)/Math.log(2)) - 1) * 10;
//h = log2(n+1) - 1
      System.out.println(Math.round(h));
              }
              }





 */