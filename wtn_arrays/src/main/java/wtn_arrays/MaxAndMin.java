package wtn_arrays;

import java.util.*;
import java.io.*;
public class MaxAndMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i,max=0,min=0;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		max=a[0];
		min=a[0];
		for(i=0;i<size;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("the maximum element of given array is "+ max);
		System.out.println("the minimum element of given array is "+ min);
		}


}