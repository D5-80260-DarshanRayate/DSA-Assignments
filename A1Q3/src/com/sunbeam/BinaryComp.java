package com.sunbeam;

import java.util.Scanner;

public class BinaryComp {

	
	public static int binarySearch(int arr[], int key) {
		//1. decide left and right of original
		int count=1;int left = 0, right = arr.length-1;
		while(left <= right) {
			//2. find middle element
			int mid = (left + right) / 2;
			//3. compare middle element with key
			if(key == arr[mid]) {
				count ++;
				return mid;
			}//3.1 if equal then return index
			else if(key > arr[mid]) {
				left = mid + 1;
			   count++;//3.2 if greater then search into right partitioin
			}
			else {
				right = mid - 1;
			count++;
			}//3.3 if less then search into left partition
		}//4. repeat step 2 and 3 till valid partition or key is not found
		//5. if not fount return -1;
		return count;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {5,9,78,92,100,101,105};
		  System.out.println("Enter the key");
		   int key = sc.nextInt();
        int a = BinaryComp.binarySearch(arr, key);
        System.out.println("No. of Comparisions are "+a);
	}

}
