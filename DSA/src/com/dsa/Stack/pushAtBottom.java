package com.dsa.Stack;

import java.util.Stack;

public class pushAtBottom {

	public static void pushAtBottom(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtBottom(data, s);
		s.push(top);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		s.push(7);
		pushAtBottom(8, s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	
}

}
