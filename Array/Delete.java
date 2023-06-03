package Array;

import java.util.Scanner;

public class Delete 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int arr[]= {10,20,30,40,50};
		int temp[]= new int[arr.length-1];
		
		int Uin = s.nextInt(), index=0;
		for(int i =0;i<temp.length;i++) 
		{
			if(i!=Uin) 
			{
				temp[index++] = arr[i];
				
			}
			
		}
		
		arr= temp;
		temp= new int [arr.length-1];
		
		for(int a :arr) 
		{
			System.out.println(a);
			
		}
		
		
		
		
	}

}
