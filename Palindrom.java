package arrays;

//check given string palindrom or not;

public class Palindrom {
	
	public static void main(String[] args)
	{
		int [] ar= {1,2,3,3,2,1};
		System.out.println(checkPalindrom(ar));
	}
		

	
	public static boolean checkPalindrom(int[] ar)
	{
		
		int i=0,j=ar.length-1;
		
		while(i<j)
		{
			if(ar[i]==ar[j])
			{
				i++;
				j--;
				
			}
			
			else
			{
				break;
			}
		}
	return i>=j;
	}
}

