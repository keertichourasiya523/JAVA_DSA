package com.dsa;

import java.util.ArrayList;

public class test_arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		  al.add(1);
		  al.add(2);
		  al.add(3);
		  
		  
		ArrayList<Integer> al2= new ArrayList<Integer>(20);
		al2.add(10);
		al2.add(2);
		al2.add(15);
		System.out.println(al2);
		
		System.out.println(al);
		System.out.println("----------------------------------------");
		ArrayList<Integer> al3= new ArrayList<Integer>(al2);
		System.out.println(al3);
		
		al3.add(20);
		System.out.println(al3);
		al3.add(2, 0);
		System.out.println(al3);
		
		al3.addAll(al);
		System.out.println(al3);
		al3.addAll(1, al2);
		System.out.println(al3);
		System.out.println("==========================");
		//remove
		al3.remove(0);// this is for removing index value
		System.out.println(al3);
		 al3.remove((Integer)0);// this is for removing the 0 in the array
		
			System.out.println(al3);
			al3.remove((Integer)3);
			System.out.println(al3);

			

		
		
		
		
		
		
		
	}
	
	
	
}
