package arrays;

public class ReverseArray {
	public static void main(String[] args)
	{
		int[] ar= {5,4,3,2,1};
		
		
		reverseArray(ar);
	}
	
	public static void reverseArray(int[] ar)
	{
		int n=ar.length;
		int start=n/2;
		int end=n-1;
		
		while(start<end)
		{
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
		
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
		
		
	}
}