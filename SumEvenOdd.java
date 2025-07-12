package arrays;

// sum of even or odd element in an array
public class SumEvenOdd {
	
	public static void main(String[] args)
	{
		int [] ar= {2,3,4,5,6,7,8};
		sumOfAr(ar);
	}

	public static void sumOfAr(int[] ar) {
		
		int oSum =0;
		int eSum=0;
		
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]%2==0)
		{
			eSum+=ar[i];
		}
		
		else
		{
			oSum+=ar[i];
			
		}
		
		
	}
		System.out.println("Even sum:"+eSum);
		System.out.println("Odd sum: "+oSum);

}
}