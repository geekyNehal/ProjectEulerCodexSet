
/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?*/

public class PrimeFind 
{
	public static void main(String[] args) 
	{
		int n=1,i=3;
		while(n!=10001)
		{
			boolean check=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					check=true;
					break;
				}
			}
			if(!check)
			{
				n++;
			}
			i++;
		}
		System.out.println(i-1);
	}

}
