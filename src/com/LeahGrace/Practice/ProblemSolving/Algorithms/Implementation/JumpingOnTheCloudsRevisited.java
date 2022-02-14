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






//// JAVA 8
/*
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class Solution {



    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {

        int n = c.length;
        int cumulus = 0;
        int cumulusPts = 1;
        int thunderhead = 1;
        int thunderheadsPts = 2;
        int current = ((0 + k) % n);
        int jumpDifferential = 1;
        int cloudDifferential = 0;
        int maxEnergy = 100;
        int partialEnergy = 100 - jumpDifferential - cloudDifferential;
        System.out.println("First jump of " + k + " spaces moves from index" + 0 + " of value " + c[0]);
        System.out.println("Start on cloud index " + current + " with value " + c[current]);
        System.out.println("Start with energy " + jumpDifferential);
        int jumps = 1;
        //run a while loop that will stop when the 0th index of c is reached
        while (c[current] != 0){
            jumps++;
            current += k;
            cloudDifferential += c[current];
            System.out.println("Jump number " + jumps + "of spaces " + k + " to land on cloud index " + current + " and add value of " + c[current]);
            if (c[current] == thunderhead){
                cloudDifferential += thunderheadsPts;

            }
            System.out.println("Differential of " + jumpDifferential + " and" + cloudDifferential);
        }

        System.out.println("Final differential of " + jumpDifferential + "and " + cloudDifferential);

        System.out.println("Final energry " + partialEnergy);


        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
*/