package wtn_numer;

public class Pronic {
	

	public static void main(String[] args) {
		int c=0,i,j;
		for(j=1;j<100;j++)
		{
			c=0;
		for(i=0;i<j/2;i++)
		{
			if(i*(i+1)==j)
			{
				c=1;
				break;
			}
		}
		
		if(c==1)
		{
			System.out.println(j+"  ");
		}
		}
	}

}
