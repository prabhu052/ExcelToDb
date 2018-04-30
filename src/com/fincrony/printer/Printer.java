/**
 * 
 */
package com.fincrony.printer;

import com.fincrony.xl2db.model.Employee;

/**
 * @author prabhu
 *
 */
public interface Printer {
	public void cPrint();
	public void jPrint(Employee emp);
}
