
/*Problem 9:There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class PythagorasTriplet 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		for(int i=50;i<1000;i++)
		{
			for(int j=50;j<1000;j++)
			{
	 	       int k=1000-i-j;
			   if((i*i+j*j==k*k)||(j*j+k*k==i*i)||(k*k+i*i==j*j))
	     	   {
				  System.out.println(i*j*k);
				  flag=true;
				  break;
			   }
			}
			if(flag==true)
				break;
		}
	}
}

