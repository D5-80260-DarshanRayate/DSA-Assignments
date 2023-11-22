package com.sunbeam;

public class Stack {

	private int[] arr;
	private int top;
	private final int SIZE;
	
	public Stack(int size)
	{
		SIZE=size;
		arr = new int[SIZE];
		//top=-1; // initially top =-1
		top=size;// for desc stack top=size
	}
	
	public void push(int value) {
		
		top--;
		arr[top]=value;
	}
	public void pop() {
		top++;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isFull()
	{
		return top==0;
	}
	public boolean isEmpty()
	{
      return top==SIZE;		
	}
	}
	

