package wtn_arrays;

import java.util.Scanner;
public class SucceedingOrders {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int p=0,q=0,i;
		for( i=0;i<n;i++)
		{
			if(a[i]==6) {
				p=i;
			break;}
		}
		for( i=0;i<n;i++) {
			if(a[i]==7) {
				q=i;
				break;}
		}
		int sum=0;
		if(p<q)
		{
			for(i=0;i<p;i++)
				sum+=a[i];
			for(i=q+1;i<n;i++)
				sum+=a[i];
		}
		else
		{
			for(i=0;i<n;i++)
				sum+=a[i];
		}
	System.out.println(sum);
		}


}