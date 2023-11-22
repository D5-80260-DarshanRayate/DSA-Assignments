package com.sunbeam;
import java.util.Scanner;
public class TestPriority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("Enter the op to check priority");
     String s = sc.next();
     int p = Priority.priority(s);
     System.out.println("Priority is "+p);
	}

}
