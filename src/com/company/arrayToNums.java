package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class arrayToNums {



    String runs = ".......111....3.4..6...1..11....2....3...W...11...1..2...33...44...W..W..1..2..1.22....1..1......1....11...111.....1.111..222.333...W...211..22.11....1...1...1...1...1..1..3...4....2...1....3...1....646421.3.222..111...333...444......1111...22..333.444............1...1...1.....11.22.WWW11.....1....11....1....1.W...W..1666..W";

    String[] runArray = runs.split("");
    int[] runToNums = new int[runArray.length];
    int wCount;


    public int[] arrayToInt() {

        for (int i = 0; i < runArray.length; i++) {
            if (runArray[i].trim().equals(".")) {             // switches "." for 0
                runToNums[i] = 0;
            } else if (runArray[i].trim().equals("W")) {      // switches "W" for -1
                runToNums[i] = -1;
                ++wCount;
            } else {
                int num = Integer.parseInt(runArray[i]);
                runToNums[i] = num;
            }

        }
        return runToNums;

    }

}
