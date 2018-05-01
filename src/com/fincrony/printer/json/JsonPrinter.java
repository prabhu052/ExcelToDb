package com.fincrony.printer.json;

import org.codehaus.jackson.map.ObjectMapper;
import com.fincrony.printer.Printer;
import com.fincrony.xl2db.model.Employee;


public class JsonPrinter implements Printer {

	@Override
	public void jPrint() {
		// TODO Auto-generated method stub
			
		ObjectMapper mapper = new ObjectMapper();
		
		
		 Employee emp = new Employee();
			
				try {
					System.out.println(mapper
							.writerWithDefaultPrettyPrinter()
							.writeValueAsString(emp));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
}
	public static void main(String []args){
		// TODO Auto-generated method stub
		Employee empl = new Employee();
		 
	    empl.setId("1");
		empl.setName("Prabhu");
		empl.setAddress("bbsr");
		empl.setSalary(42000.00);
		empl.setJoiningDate("doj");
		
		
	    empl.getId();
		empl.getName();
		empl.getAddress();
		empl.getSalary();
		empl.getJoiningDate();
		 
		empl.toString();
		empl.jPrint();
	   
	}
	@Override
	public void cPrint() {
		// TODO Auto-generated method stub
		
	}

}
