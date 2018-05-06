package com.fincrony.printer.json;

import org.codehaus.jackson.map.ObjectMapper;
import com.fincrony.printer.Printer;
import com.fincrony.xl2db.model.Employee;

public class JsonPrinter implements Printer {

	//@SuppressWarnings("resource")
	@Override
	public void jPrint() {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();	
		
		 Employee emp = new Employee();
		 
		    emp.setSl("1");
			emp.setName("Prabhu");
			emp.setAddress("bbsr");
			emp.setSalary(42000.00);
			emp.setJoiningDate("doj");
		
		/*System.out.println("Enter the path of the Excel :");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();	
				
		new DefaultEmployeeParser().readExcel(path);
		
		Employee emp = new Employee();
		
		emp.getSl();
		emp.getName();
		emp.getAddress();
		emp.getSalary();
		emp.getJoiningDate();*/
		
				try {
					System.out.println(mapper
							.writerWithDefaultPrettyPrinter()
							.writeValueAsString(emp).toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
}

	/*public static void main(String[]args){
		// TODO Auto-generated method stub
		
		 JsonPrinter jpr = new JsonPrinter();
		 jpr.jPrint();
			
	}*/
	@Override
	public void cPrint() {
		// TODO Auto-generated method stub
		
	}

}
