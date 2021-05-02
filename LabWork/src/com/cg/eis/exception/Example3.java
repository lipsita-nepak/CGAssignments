package com.cg.eis.exception;

import java.util.Scanner;

public class Example3 {

	static void getSalary(double salary)throws EmployeeSalaryException{
		if(salary<3000)
			throw new EmployeeSalaryException("Salary below 3000!!!");
		else
			System.out.println("Salary is:"+salary);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary:");
		double sal=sc.nextDouble();
		try {
			getSalary(sal);
		}
		catch(EmployeeSalaryException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

	}


