package com.sunbeam;
import java.util.Scanner;

public class Palindrome {

	public  static boolean getPalindrome(String s) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		StringBuilder sbr = sb.reverse();
		 boolean status = sbr.toString().equals(s);
		 return status;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		if(Palindrome.getPalindrome(str)==true) {
			System.out.println("Is Palindrome");
		}else
			System.out.println("Not a Palindrome");
		
	}

}
