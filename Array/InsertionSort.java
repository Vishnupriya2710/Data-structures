package Array;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {9,7,5,3,2};
		
		for (int i=1;i<arr.length;i++) // i=1;1<5  // 
		{
			int k = arr[i];          // k=7
			int j = i-1;             //j=0
			
			while(j>=0&& arr[j]>k)  //0>=0 && 9 >7
			{
				arr[j+1] = arr[j];  //  arr[1] = 9
				j--;                //  
			}
			   arr[j+1] = k;        
			
	    }
		
		for (int a : arr) 
		{
			System.out.println(a);
		}
		
	}

}
