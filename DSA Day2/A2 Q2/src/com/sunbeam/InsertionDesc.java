package com.sunbeam;

import java.util.Arrays;

public class InsertionDesc {

	public static int insertionSort(int[] arr, int N) {
		 int comp=0;
		for(int i=0;i<N;i++) {
		int temp = arr[i];
		int j;
		
		for(j=i-1;j>=0 && arr[j]<temp;j--) { // only change the comparison from arr[j]>temp to <
			arr[j+1] = arr[j];
			comp++;
		}
		arr[j+1] = temp;	
	
		}
		return comp;

	}

	public static void main(String[] args) {

		int[] arr = {55,44,22,66,11,33 };
        System.out.println("Before sort "+Arrays.toString(arr));
		int comp= insertionSort(arr, arr.length);
		
		System.out.println("After sort "+Arrays.toString(arr));
		System.out.println(comp);	
	}

}

	
	

