package com.test;

import static org.junit.Assert.*;
import org.junit.*;
import com.fincrony.printer.json.JsonPrinter;
import com.fincrony.xl2db.model.Employee;

@SuppressWarnings("unused")
public class Test {

	@org.junit.Test
	/*public void test() {
		
		Employee emp = new Employee();
		emp.cPrint();
		
	}*/
	
public void jsonTest() {
		
        JsonPrinter jpr = new JsonPrinter();
		jpr.jPrint();
		
	}
}
