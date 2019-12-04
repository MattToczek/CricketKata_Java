package com.company;
import com.company.arrayToNums;
import java.util.Arrays;
import com.company.Player;
import com.company.switchPlayers;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
                        //
        arrayToNums newArray = new arrayToNums();

        int[] array = newArray.arrayToInt();

        switchPlayers switchP = new switchPlayers();


        Player allPlayers[] = new Player[11];
//        System.out.println(allPlayers[2]);

        for (int i = 0; i < allPlayers.length; i++) {
            allPlayers[i] = new Player("player" + Integer.toString(i + 1), 0, false);
            allPlayers[i].display();

        }

//        System.out.println(Arrays.toString(allPlayers));
        Player currPlayers[] = new Player[2];
        currPlayers[0] = allPlayers[0];
        currPlayers[1] = allPlayers[1];

        System.out.println("currPlayers length = " + currPlayers.length);
//

//        int wCount = 0;
        int score = 0;
        int bowlCount = 0;
        int outCount = 0;
        int batterInd = 1;




//        System.out.println(Integer.parseInt("."));


        System.out.println(Arrays.toString(array));
        System.out.println(array.length);


        for (int i = 0; i < array.length; i++) {


                    ++bowlCount;                                // bowl count goes up for each ball

                    if (array[i] >= 0) {                        // switches "." for 0
                        currPlayers[0].addRuns(array[i]);
                        score += array[i];
                        switchP.switchEnds(currPlayers, array[i]);

                    } else {      // switches "W" for -1
                        ++batterInd;
                        ++outCount;
                        currPlayers[0].pOut(true);
                        currPlayers[0] = (batterInd>=allPlayers.length? currPlayers[0] : allPlayers[batterInd]);        // checks batters are still available
                    }

//                    System.out.println(runToNums[i]);



//                    if (array[i] < 0) {          // checks for an out and switches players
//
//                        currPlayers = switchP.switchPlayers(currPlayers); // to be amended
//                    }

                    if (bowlCount >= 7) {                                       // checks for an over to be finished and ups overCount
                        currPlayers = switchP.switchPlayers(currPlayers);
                        bowlCount = 1;
                        System.out.println("over");
                    }

                    System.out.println("after: " + currPlayers[0].getName() + ":  " + currPlayers[0].getRuns() + " and " + currPlayers[1].getName() +":  " + currPlayers[1].getRuns()  + "_____________" + array[i]);


                }

            for (int index = 0; index < allPlayers.length; index++) {               // Once loop has been completed logs final stats
                allPlayers[index].display();
            }
            System.out.println("Final score= "+ score + "/" + outCount);

        }


}
