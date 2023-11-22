package com.sunbeam;

import java.util.Scanner;

//. Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach.
public class Comparisions {

public static int count(int[] arr,int key, int n)
{  
    int index=0;
	int count=1;
	for(int i=0;i<n;i++) {
		if(arr[i]==key) {
			index  = i;
			break; // break will return the first occurence and come out of the loop whereas w/o break we will get the last occurence
		}
		count++;
	}
	return count;


}
	
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
			
		int[] arr = {10,5,6,7,6,8,9,3};
	   System.out.println("Enter the key");
	   int key = sc.nextInt();
		int a = Comparisions.count(arr, key, 8);
		System.out.println("The no of comparisions are "+a);
	
		
	}
}
