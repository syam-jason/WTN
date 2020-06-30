package wtn_numer;

import java.util.Scanner;
public class Disarium {
	public static void main(String[] args) {
		int a,c=0,d;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		d=a;
		while(a>0)
		{
			c=c+a%10;
			a=a/10;
		}
		if(d%c==0)
		{
			System.out.println("its a harshad ");
		}
		else
		{
			System.out.println("its not a harhsad ");
		}
	}

}