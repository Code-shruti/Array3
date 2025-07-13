package arrays;

//count of prime number in an array
public class PrimeNum {
	public static void main(String[] args)
	{
		int [] ar= {2,3,4,5,7,6,11,12};
		
		checkPrime(ar);
		
	}

	public static void checkPrime(int[] ar)
	{
		int cnt=0;
		int ncnt=0;
	
		for(int i=0;i<ar.length;i++)
		{
			for(int j=2;j<(ar[i]/2);j++)
			{
			      if(ar[i]%j==0)
				    ncnt++;
			else
				cnt++;
			}
			
			
		}
		System.out.println("count of prime number: "+cnt);
		System.out.println("count of not prime number: "+ncnt);

	}
}
