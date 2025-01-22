package Searching;

import java.util.Scanner;

import com.ArrayOperations;

public class Linear_Search {

	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    int ar[] = ArrayOperations.readArray();
    System.out.println("Enter the element to be found");
    
    int ele = s.nextInt();
    
    boolean flag = false;
    
    for(int i = 0; i<ar.length;i++)
    {
    	if(ele==ar[i])
    	{
    		flag = true;
    		System.out.println("element found at : "+i+" index");
    		break;
    	}
    }
		if(flag == false)
			System.out.println("Element not found");
		
		
		
		
		
		
		
	}

}
