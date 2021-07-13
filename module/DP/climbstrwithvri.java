
import java.io.*;
import java.util.*;
public class climbstrwithvri {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int moves[]=new int [n];
        for(int i=0; i<moves.length;i++){
            moves[i]=scn.nextInt();
            
        }
        int dp[]=new int[n+1];
        for(int i=n; i>=0; i--){
            if(i==n){
            dp[i]=1;
            
        }else{
            int maxjump=moves[i];
            for(int len =1;len<=maxjump&& len+i<=n;len++){
                dp[i] +=dp[i+len];
            }
        }
        // write your code here
    }
    System.out.println(dp[0]);

}}