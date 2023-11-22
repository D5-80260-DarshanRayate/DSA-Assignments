package com.sunbeam;

public class Queue {

	private int[] arr;
	private int front;
	private int rear;
	private final int SIZE;
	
	public Queue(int size) {
		this.SIZE=size;
		front=rear=0;
		arr= new int[SIZE];
		}
	
	public void push (int value){
		arr[rear]=value;
		rear++;
	}
	public int pop (){
		int value = arr[front];
		front++;
		return value;
	}
	public int peek() {
		return arr[front];
	}
	public boolean isEmpty() {
		
		return front==rear;
	}
	public boolean isFull() {
		
		return rear==SIZE;
	}
	}

