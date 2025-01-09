package com.dsa.Stack;
import java.util.*;
public class StackClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		s.push(7);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	
}
	//this is used by java collection framework in which this stack class is already exist

}
