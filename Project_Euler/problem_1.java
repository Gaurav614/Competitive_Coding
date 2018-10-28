/*
hackerrank question
https://www.hackerrank.com/contests/projecteuler/challenges/euler001
*/
/* the approach is simple we added the sum of 
multiples of 3 and 5 and subtracting the multiples of 15
The formula used is 
(x*n*(n+1))/2
where x is the number whose multiple we want 
and n is the number of elements
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long x3=n/3;
            x3=((x3*3)==n)?x3-1:x3;
            long x5=n/5;
            x5=((x5*5)==n)?x5-1:x5;
            long x15=n/15;
            x15=((x15*15)==n)?x15-1:x15;
            long s=((x3*(x3+1))/2)*3+((x5*(x5+1))/2)*5-((x15*(x15+1))/2)*15;
                System.out.println(s);
            
            
        }
    }
}