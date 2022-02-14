package com.LeahGrace.Practice.ProblemSolving.Algorithms.Implementation;

import java.util.*;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        /* TEST CASE 0 *****
       // int n = 8; //number of clouds
      //  int k = 2; //Jump size
        //ArrayList<Integer> c = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 0, 1, 1, 0));
         */

        int n = 10;
        int k = 3;

        int e = 100; //energy level
        int startFinishIndex = 0; //index of cloud to finish on
        int cumulusCloudDifferential = 1;
        int thundercloudEnergyDifferential = 2 + cumulusCloudDifferential; //energy spent landing on thunderclouds

        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 1, 1, 0, 0, 0, 0));

       do {
           startFinishIndex += k;
           e -= (c.get(startFinishIndex % n) != 0 ? thundercloudEnergyDifferential : cumulusCloudDifferential);

       } while ((startFinishIndex % n) != 0);

        System.out.println(e);

    }
}