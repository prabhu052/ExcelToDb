/**
 * 
 */
package com.test;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.*;

import com.fincrony.xl2db.model.Employee;

/**
 * @author prabhu
 *
 */

@SuppressWarnings("unused")

public class JsonTest {
	
	@org.junit.Test
	public void test() {
		Employee empl = new Employee();
		JSONObject json = new JSONObject(empl); 
		System.out.println(json.toString(4));
		empl.jPrint();
	}
}