package arrays;

// check the given element is present in an array or not
public class ElementPresent {
	
	public static void main(String[] args)
	{ 
	    int [] ar = {10,20,30,40,50};
		System.out.println(elementPresent(ar)?"given number is present in array":"given number is not present in array");
	}

	public static boolean elementPresent(int[] ar) {
		int num=11;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==num)
				return true;
		}
		
		return false;
		
	}
}
