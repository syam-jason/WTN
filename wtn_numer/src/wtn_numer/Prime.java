package wtn_numer;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long mul=1;
            int x = sc.nextInt();
            long a[] = new long[x];
            for(i=0;i<x;i++)
            {
                a[i]=sc.nextLong();
                mul = mul*a[i];
            }
            long z =2;
            while(z>0 && z<=Math.pow(10,18))
            {
                Double ree = Math.pow(z,2);
                if(mul%ree==0)
                {
                    System.out.println(z);
                    break;
                }
                z++;
            }
        }
    }
}