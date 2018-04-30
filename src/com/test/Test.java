package com.test;

import static org.junit.Assert.*;
import org.junit.*;

import com.fincrony.xl2db.model.Employee;

@SuppressWarnings("unused")
public class Test {

	@org.junit.Test
	public void test() {
		
		Employee emp = new Employee();
		emp.cPrint();
		
	}
	
/*public void jsonTest() {
		
		Employee empl = new Employee();
		
		empl.setId("1");
		empl.setName("Prabhu");
		empl.setAddress("bbsr");
		empl.setSalary(42000.00);
		empl.setJoiningDate("doj");
		
		empl.jPrint();
		
	}*/
}
