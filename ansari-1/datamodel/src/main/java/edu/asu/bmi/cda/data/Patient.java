package edu.asu.bmi.cda.data;

public class Patient
{
	private int age;
	private String name, id;
	
	public Patient(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getId(){
		return this.id;
	}
	
	public int getAge(){
		return this.age;
	}
}
