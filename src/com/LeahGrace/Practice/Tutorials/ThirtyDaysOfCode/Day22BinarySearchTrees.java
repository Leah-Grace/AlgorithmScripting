package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;
import java.util.*;



public class Day22BinarySearchTrees {
/*

      static class TreeNode{
            TreeNode left;
            TreeNode right;
            int data;
            TreeNode(int data){
                  this.data=data;
                  left=right=null;
            }
      }
*/
      public static int getHeight(TreeNode root){
            //Write your code here
            int leftTree = 0;
            int rightTree = 0;
            TreeNode current = root;

            if (current.right != null){
                  //rightTree++;
                  rightTree += getHeight(current.right) + 1;

            }

            current = root;

            if (current.left !=null){
                  //leftTree++;
                  leftTree += getHeight(current.left) + 1;
            }


            return (leftTree >= rightTree) ? leftTree : rightTree;

      }

            public static TreeNode insert(TreeNode root,int data){
                  if(root==null){
                        return new TreeNode(data);
                  }
                  else{
                        TreeNode cur;
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
                  TreeNode root=null;
                  while(T-->0){
                        int data=sc.nextInt();
                        root=insert(root,data);
                  }
                  int height=getHeight(root);
                  System.out.println(height);
            }
      }


