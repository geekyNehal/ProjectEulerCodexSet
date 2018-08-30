
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

public class LargestPalindrome {

	public static void main(String[] args) 
	{
		long prod,max=0;
		for(int i=100;i<1000;i++)
		{
			for(int j=100;j<1000;j++)
			{
				prod=i*j;
				if(isPalindrome(prod)&&prod>max)
				{
						max=prod;
				}	
			}
		}
		System.out.print(max);
	}
	public static boolean isPalindrome(long n)
	{
		long s=n;
		long rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return s==rev;
	}
}
