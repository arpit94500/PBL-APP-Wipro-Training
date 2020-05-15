package com.mile1.bean;

public class Student 
{
	public String name;
	public int marks[]=new int[3];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
    public Student () {
		
	}
	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
}
