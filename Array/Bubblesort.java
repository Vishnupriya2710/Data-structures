package Array;

public class Bubblesort 
{
	public static void main(String[] args) 
	{
		int arr[] = {5,7,3,9,4,1}; 
		int n = arr.length-1; //6-1=5
		
		for(int i=0; i<n; i++) // i=3,3<5  
			
			
			// {1,5,3,7,4,9}
			// {1,3,5,4,7,9}
			// {1,3,4,5,7,9
			// {1,3,4,5,7,9}
			//// {1,3,4,5,7,9}
		{
		for(int j=0; j<n-i; j++) 
			
		

			

		{
			if(arr[j] > arr[j+1])   
			{
				int temp =arr[j];  
				arr[j] = arr[j+1];
				arr[j+1] = temp;  
				
				
			}
			
			
			
		}
		for(int a : arr) {
		//	System.out.println(a);
			System.out.print(a+" ");
			
		}
		System.out.println();
			
		}
		
	}

}

