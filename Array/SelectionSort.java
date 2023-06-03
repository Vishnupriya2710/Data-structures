package Array;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {6,2,9,1,7,5};
		
		for(int i =0; i<arr.length-1; i++) 
		{
			int index = i; //0 , 
			for(int j=i+1 ;j<arr.length;j++)  // 1,1<6
			{
				if(arr[index]>arr[j])  // 6>2
					 index = j;        // i = 1
				{
					 int temp = arr[i] ;   // temp = 6
					 arr[i] = arr[index];  // arr[0] = 2
					 arr[index] = temp;    // arr[1] = 6
					
				}
			}
			
			// {2,6,9,1,7,5}
			
			for(int a : arr)
			{
				System.out.print(a + "" );
			}
			System.out.println();
		}
		
	}

}
