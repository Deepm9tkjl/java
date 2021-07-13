import java.io.*;
import java.util.*;
package module.comlexity;


public class facto {
public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
       if(n == 0) {
           //0! = 1
           return 1;
       }