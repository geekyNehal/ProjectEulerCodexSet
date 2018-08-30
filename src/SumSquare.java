
/*
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */

public class SumSquare {

	public static void main(String[] args) 
	{
		int sqSum=0,sumSq=0;
		for(int i=1;i<=100;i++)
		{
			sqSum=sqSum+i*i;
			sumSq=sumSq+i;
		}
		int diff=sumSq*sumSq-sqSum;
		System.out.println(diff);
	}

}
