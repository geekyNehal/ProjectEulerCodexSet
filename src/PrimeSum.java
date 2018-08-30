

/*Problem 10:The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/

public class PrimeSum 
{
	public static void main(String[] args) 
	{
		long i=5,sum=5;
		while(i<2000000)
		{
			boolean check=false;
			for(long j=3;j<i;j++)
			{
				if(i%j==0)
				{
					check=true;
					break;
				}
			}
			if(!check)
			{
				sum+=i;
			}
			i=i+2;
		}
		System.out.println(sum);
	}

}
