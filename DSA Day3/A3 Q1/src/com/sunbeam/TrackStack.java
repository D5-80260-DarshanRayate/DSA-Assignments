package com.sunbeam;

public class TrackStack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public TrackStack(int SIZE) { //constr to initialize values
		this.SIZE=SIZE;
		arr= new int[SIZE];
		top=-1;
	}
	public void push(int element) {
		top++;
		arr[top]=element;
	}
	public void pop() {
		top--;
		}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top ==-1;
	}
	public boolean isFull()
	{
		return top==SIZE-1;
	}
	
		
		
		
	}

