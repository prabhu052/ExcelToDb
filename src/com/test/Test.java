package com.test;

import com.fincrony.printer.console.ConsolPrinter;
import static org.junit.Assert.*;
import org.junit.*;
import com.fincrony.printer.json.JsonPrinter;
import com.fincrony.xl2db.model.Employee;

@SuppressWarnings("unused")
public class Test {

	@org.junit.Test
	/*public void test() {
		
		ConsolPrinter cpr = new ConsolPrinter();
		//Employee emp = new Employee();
		cpr.cPrint();
		
	}*/
	
public void jsonTest() {
		
        JsonPrinter jpr = new JsonPrinter();
		jpr.jPrint();
		
	}
}
