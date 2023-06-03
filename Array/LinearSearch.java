package Array;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		
		
		int[] arr= {5,10,15,20,25};
	
	    	int k = s.nextInt();
	   
	   for(int i =1; i<arr.length; i++) 
	   {
		   if(k==arr[i]) 
		   {
			   System.out.println("found");
			   return;
		   }
	   }
			   System.out.println("Not Found");
			   
		   
		   
	   }
				
		
	}


