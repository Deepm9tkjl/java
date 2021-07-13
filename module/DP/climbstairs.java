import java.io.*;
import java.util.*;


    public class climbstairs {
        public static void main(String[] args) {
        //     int ways =cbstair(4);
        //     System.out.println(ways);
        // }
        // public static int cbstair(int n){
        //     if(n==0){
        //         return 1;
    
        //     }
        //     int  tways=0;
        //     if(n-1>=0){
        //         tways+=cbstair(n-1); //1 len
        //     }
        //     if(n-2>=0){
        //         tways+=cbstair(n-2); //2 len
        //     }
        //     if(n-3>=0){
        //         tways+=cbstair(n-3); //3 len
        //     }
        //  return tways;    
    //     int n=4;
    //     int ways =cbstair(n,new int [n+1]);
    //     System.out.println(ways);
    // }
    // public static int cbstair(int n , int dp[]){
    //     if(n==0){
    //         return dp[n]= 1;

    //     }
    //     int  tways=0;
    //     if(n-1>=0){
    //         tways+=cbstair(n-1,dp); //1 len
    //     }
    //     if(n-2>=0){
    //         tways+=cbstair(n-2,dp); //2 len
    //     }
    //     if(n-3>=0){
    //         tways+=cbstair(n-3,dp); //3 len
    //     }
    //  return dp[n]= tways;
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //int[]qb = new int[n+1];
    
   
    int ways = climbStairs_tab(n);
    System.out.println(ways);
    // write your code here
}


public static int climbStairs_tab(int n) {
    int[]dp = new int[n+1];
    
    //dp[i] -> i to 0 ways
    dp[0] = 1;
    
    for(int i=1; i <= n;i++) {
        if(i == 1) {
            dp[i] = dp[i-1];
        }
        else if(i == 2) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        else {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
    }
    
    return dp[n];
}
}