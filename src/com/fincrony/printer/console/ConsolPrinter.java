package com.fincrony.printer.console;

import java.util.Scanner;

import com.fincrony.printer.Printer;
import com.fincrony.xl2db.model.Employee;
import com.fincrony.xl2db.parser.DefaultEmployeeParser;

public class ConsolPrinter implements Printer {

	@SuppressWarnings("resource")
	@Override
	public void cPrint() {
		// TODO Auto-generated method stub
		System.out.println("Enter the path of the Excelfile :");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();	
		
		
		new DefaultEmployeeParser().readExcel(path);
		
		Employee emp = new Employee();
		emp.getSl();
		emp.getName();
		emp.getAddress();
		emp.getSalary();
		emp.getJoiningDate();

	}
	
	/*public static void main(String[]args){
		// TODO Auto-generated method stub
		ConsolPrinter cpr = new ConsolPrinter();
		//Employee emp = new Employee();
		cpr.cPrint();
			
	}*/

	@Override
	public void jPrint() {
		// TODO Auto-generated method stub
		
	}
	

}
