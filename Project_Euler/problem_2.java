/*https://www.hackerrank.com/contests/projecteuler/challenges/euler002*/



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
            long n = in.nextLong();
            ArrayList<Long> arr=new ArrayList();
            arr.add((long)1);
            arr.add((long)2);
            int i=2;
            while(arr.get(arr.size()-1)<=n){
                long x=arr.get(i-1)+arr.get(i-2);
                if(x>n)
                    break;
                arr.add(x);
                i++;
            }
            long s=0;
            for(i=1;i<arr.size();i++)
            {
                long x=arr.get(i);
                if(x%2==0)
                    s+=x;
            }
            System.out.println(s);
        }
    }
}