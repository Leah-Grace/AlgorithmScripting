package com.LeahGrace.Practice.Tutorials.ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

public class Day23BSTLevelOrderTraversal {
    static void levelOrder(TreeNode root) {

        ArrayList<TreeNode> tempQueue = new ArrayList<>();
        ArrayList<TreeNode> printQueue = new ArrayList<>();

        TreeNode current = root;

        while (current != null) {
            printQueue.add(current);

            if (current.left != null) {
                tempQueue.add(current.left);
            }
            if (current.right != null) {
                tempQueue.add(current.right);
            }
            //remove first Node from temp queue
            //assign value to current
            if (tempQueue.size() > 0) {
                current = tempQueue.remove(0);
            } else {
                current = null;
            }
        }
        for (TreeNode n : printQueue) {
            System.out.print(n.data + " ");
        }
    }


    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }

}
/*

1. Declare empty queue
2. Declare temp node and set to root
3. Loop:
    - while temp node is not null
        - print temp node data
        - Enqueue temp node children (Left then right child)
        - Dequeue a node from the queue and assign its value to the temp node

 */