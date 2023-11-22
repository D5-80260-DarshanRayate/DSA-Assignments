package com.sunbeam;
import java.util.Arrays;
import java.util.Scanner;
public class EmpMain {

	public static void findById(Employee[] e, int key)
	{
		int count = 0;
		for(Employee employee: e)
		{
			if(employee.getId()==key)
			{
				System.out.println("Employee Found");
				count++;
				break;
			}
			
		}
		if(count==0)
		{
			System.out.println("Not");
		}
	}
		// sorting by salary using insertion sort
	public static void sortBySalary(Employee[] e, int size) {

		for(int i=0;i<size;i++) {
			Employee temp = e[i];
			int j;
	   for(j=i-1;j>=0 && e[j].getSalary()>temp.getSalary();j--) {
		   e[j+1] = e[j];
	   }
		e[j+1] = temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	     Employee[] employees = {
	                new Employee("John Doe", 1, 50000),
	                new Employee("Jane Smith", 2, 60000),
	                new Employee("Bob Johnson", 3, 55000),
	                new Employee("Bob Builder", 4, 30000),
	                new Employee("Mitch Johnson", 5, 40000)
	               
	        };
//	     System.out.println("Enter the id ");
//	     int id = sc.nextInt();
//	     EmpMain.findById(employees, id);
	     System.out.println("Before sort "+Arrays.toString(employees));
	     sortBySalary(employees,employees.length);
	     System.out.println("After sort "+Arrays.toString(employees)); 

	}

}
