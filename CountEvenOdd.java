package arrays;

//count even and odd number in an array
public class CountEvenOdd {
	
	public static void main(String[] args)
	{
		int [] ar= {100,103,202,200,205,213,215};
		countEvenOdd(ar);
	}
		
	
			public static void countEvenOdd(int[] ar)
			{
				int evenCount=0;
				int oddCount=0;
				
				for(int i=0;i<ar.length;i++)
				{
					if(ar[i]%2==0)
						evenCount++;
					
					else
						oddCount++;
				}
				
				System.out.println("Even number count: "+evenCount);
				System.out.println("odd number count: "+oddCount);
				
			}
	
	}

