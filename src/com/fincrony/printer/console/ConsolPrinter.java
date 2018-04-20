package com.fincrony.printer.console;

import java.util.Scanner;

import com.fincrony.printer.Printer;
import com.fincrony.xl2db.model.Employee;
import com.fincrony.xl2db.parser.DefaultEmployeeParser;

public class ConsolPrinter implements Printer {

	@SuppressWarnings("resource")
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Enter the path of the Excelfile :");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();	
		
		
		new DefaultEmployeeParser().readExcel(path);
		
		Employee emp = new Employee();
		emp.getId();
		emp.getName();
		emp.getAddress();
		emp.getSalary();
		emp.getJoiningDate();

	}

	

}
