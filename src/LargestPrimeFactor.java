
/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ? */


public class LargestPrimeFactor {
	public static void main(String[] args) 
	{
		long n=600851475143l;
		int i=1;
		int max=0;
		while(n>=1)
		{
			if(n%i==0)
			{
				if(isPrime(i))
				{
					n=n/i;
					if(i>max)
					{
						max=i;
					}
				}
			}
			i++;
		}
		System.out.println(max);
	}
	static boolean isPrime(int a)
	{
		int k=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				k=1;
				break;
			}
		}
		if(k!=0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
