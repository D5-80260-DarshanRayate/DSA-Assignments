package com.sunbeam;

public class Stack {
	
    private int top;
	private final int SIZE;
	private int arr[];
	
	
	public Stack(int[] arr, int size) {
		
		this.SIZE=size;
		arr = new  int[SIZE];
		top = -1;
	}
	public void push(int value)
	{
		top++;
		arr[top]= value;
	}
	public void pop() {
		top--;
	}
	public int peek() {
		return  arr[top];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull() {
		return top==SIZE-1;
	}
	}
	}

