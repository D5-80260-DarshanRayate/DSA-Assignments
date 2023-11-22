package com.sunbeam;

import java.util.Scanner;

//Write a linear search algorithm to return index of last occurance of key.
public class Linear {

public static int getLast(int[] arr,int key, int n)
{  
	int index=0; 
	for(int i=0;i<n;i++) {
		if(arr[i]==key) {
			index  = i;
			break; // break will return the first occurence and come out of the loop whereas w/o break we will get the last occurence
		}
		
	}
	return index;


}
	
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
			
		int[] arr = {10,5,6,7,6,8,9,3};
	   System.out.println("Enter the key");
	   int key = sc.nextInt();
		int a = Linear.getLast(arr, key, 8);
		System.out.println("The element is found at"+a);
	
		
	}
}
