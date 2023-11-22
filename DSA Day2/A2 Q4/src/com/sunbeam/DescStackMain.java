package com.sunbeam;
import java.util.Scanner;
public class DescStackMain {

	public static void main(String[] args) {
	
		Stack st = new Stack(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
		switch(choice) {
		
		case 1: //push
			
		if(st.isFull())
			System.out.println("Stack is full");
		else
			System.out.println("Enter the value to push");
		   int value = sc.nextInt();
			st.push(value);
		break;
		
		case 2: //pop
			if(st.isEmpty())
				System.out.println("Stack is Empty");
			else
			 st.pop();
			break;
	   
		case 3:
			//peek
			int top = st.peek();
		   System.out.println("Topmost element is"+top);
		   break;
		}
	}while(choice!=0);
		
		
		
		
		
		
	}

}
