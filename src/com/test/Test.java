package com.test;

import static org.junit.Assert.*;
import org.junit.*;

import com.fincrony.xl2db.model.Employee;

@SuppressWarnings("unused")
public class Test {

	@org.junit.Test
	public void testPrint() {
		
		Employee emp = new Employee();
		emp.print();
		
	}
}
