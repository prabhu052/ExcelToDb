package com.fincrony.xl2db.model;

import com.fincrony.printer.console.ConsolPrinter;

public class Employee extends ConsolPrinter {

	private String sl;
	private String name;
	private String address;
	private Double salary;
	private String joiningDate;

	public String getSl() {
		return sl;
	}

	public void setSl(String sl) {
		this.sl = sl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	/*@Override
	public String toString() {

		return "Id = " + this.id + "Name = " + this.name + " Address= " + this.address + "JoiningDate = "
				+ this.joiningDate + " Salary= " + this.salary;

	}*/
}
