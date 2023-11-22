package com.sunbeam;

public class Priority {

	public static int priority(String op) {
		
		switch(op) {
		
		case "$": return 10;
		case "/": return 9;
		case "*": return 9;
		case "%":return 9;
		case "+":return 8;
		case "-":return 8;
		
		
		
		
		
		}
		
		
		
		return 0;
		
		
		
		
	}
}
