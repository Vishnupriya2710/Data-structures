package Array;

import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
	
		Scanner s = new Scanner(System.in);
		
		int arr[]= {10,20,30,40,50}; 
         
		int k= s.nextInt(), l=0 , h= arr.length-1; // 40
		
		while(l<=h) //0<=4 // 3<=4
		{
			int mid = (l+h)/2; //2 // 3
			System.out.println(mid);
			
			if(k==arr[mid]) // 40==30 // 40 ==40
			{
				System.out.println("Found");
				return;
			}
			else if (k>arr[mid])  // 40>30
			{
				l= mid+1;      //2+1=>3  => l=3
			}
			
			else 
			{
				h= mid-1;    
			}
			
			
			
			}
		System.out.println(" Not found");
		
	}

}
