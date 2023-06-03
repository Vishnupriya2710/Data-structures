package Array;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
     	    int[] arr = {5,10,15,20,30};
     		int[] temp = new int[arr.length+1];
		
 //     int UIn = s.nextInt()
//		int k   = s.nextInt();
//		int index = 0;
		
		int UIn = s.nextInt(),k=s.nextInt(),index=0;
		
		
		for(int i=0;i<temp.length;i++) 
		{
			
			if(i==UIn) 
			{
				temp[i] = k;
				
			}
			else {
				temp[i] = arr[index++];
				
			}
		       
	    }
		arr= temp;
	    
	     temp=new int[arr.length+1];
		
		for(int a:arr) 
		{
			System.out.println(a);
		}
		
		
			
		


}
   }
	
