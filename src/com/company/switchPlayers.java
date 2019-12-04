package com.company;

public class switchPlayers{

   public Player[] switchPlayers(Player[] arr) {

       Player temp;
       temp = arr[1];
       arr[1] = arr[0];
       arr[0] = temp;

       return arr;
   }

   private boolean isEven(int num){
       if(num%2>0){
           return false;
       } else {
           return true;
       }
   }

   public Player[] switchEnds(Player[] arr, int num){
       if(!isEven(num)){
           switchPlayers(arr);
       }

       return arr;
   }
}
