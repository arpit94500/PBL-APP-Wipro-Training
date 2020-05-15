package com.employees.tm1;

public class Designation {
	private char DesignationCode;
	private String Designation;
	char getDesignationCode() {
		return DesignationCode;
	}
	void setDesignationCode(char designationCode) {
		DesignationCode = designationCode;
	}
	String getDesignation() {
		return Designation;
	}
	void setDesignation(String designation) {
		Designation = designation;
	}
	int getDA() {
		return DA;
	}
	void setDA(int dA) {
		DA = dA;
	}
	private int DA;
	public Designation(char designationCode, String designation, int dA) {
		super();
		DesignationCode = designationCode;
		Designation = designation;
		DA = dA;
	}
}