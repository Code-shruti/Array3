package arrays;

// sum of all number in given array
public class ArraySum {
	
	public static void main(String[] args)
	{
		int[] ar= {1,2,3,4,5};
		
		sumOfNumber(ar);
		
	}
	
	public static void sumOfNumber(int[] ar)
	{
		
		int sum=0;
		
		for(int i=0;i<ar.length;i++)
			sum+=ar[i];
		System.out.println(sum);
	}
	

}
