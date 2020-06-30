package wtn_arrays;
import java.util.Scanner;

public class ArrayWithAscii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int i;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		for(i=0;i<size;i++)
			System.out.print(((char)a[i]) +" ");
			

	}


}
