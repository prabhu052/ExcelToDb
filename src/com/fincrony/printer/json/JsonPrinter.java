package com.fincrony.printer.json;

import java.util.Scanner;

import org.json.JSONObject;

import com.fincrony.printer.Printer;
import com.fincrony.xl2db.model.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

//@SuppressWarnings("unused")
public class JsonPrinter implements Printer {

	@SuppressWarnings("resource" )
	@Override
	public void jPrint() {
		// TODO Auto-generated method stub
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		
		System.out.println("Enter the path of the Excel :");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();	
		
		JsonElement je = jp.parse(path);
		String prettyJsonString = gson.toJson(je);
		
		JSONObject json = new JSONObject(prettyJsonString); 
		System.out.println(json.toString(4));
		
		Employee empl = new Employee();
		empl.getId();
		empl.getName();
		empl.getAddress();
		empl.getSalary();
		empl.getJoiningDate();
		
	}

	@Override
	public void cPrint() {
		// TODO Auto-generated method stub
		
	}

}
