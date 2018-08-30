
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

public class LargestPalindrome {

	public static void main(String[] args) 
	{
		long prod;
		boolean check=false;
		for(int i=999;i>=800;i--)
		{
			for(int j=999;j>=800;j--)
			{
				prod=i*j;
				if(isPalindrome(prod))
				{
						System.out.println(prod);
						System.out.println(i+" "+j);
						check=true;
						break;
				}	
			}
			if(check==true)
				break;
		}
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
