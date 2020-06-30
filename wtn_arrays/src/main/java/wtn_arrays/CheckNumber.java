package wtn_arrays;
import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int i,found=0;
		int[] a=new int[size];
		for(i=0;i<size;i++)
			a[i]=sc.nextInt();
		int searchelement=sc.nextInt();
		
		for(i=0;i<size;i++) {
			if(a[i]==searchelement) {
				found=1;
			break;}}
		if(found==1)
			System.out.println(i);
		if(found==0)
			System.out.println("-1");
	}


}
