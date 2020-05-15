package com.employees.tm1;

public class Entry {
	private int EmpNo;
	private String EmpName;
	private String JoinDate;
	private char DesignationCode;
	private String Department;
	
	private int Basic;
	private int HRA;
	private int IT;
	int getEmpNo() {
		return EmpNo;
	}
	void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	String getEmpName() {
		return EmpName;
	}
	void setEmpName(String empName) {
		EmpName = empName;
	}
	String getJoinDate() {
		return JoinDate;
	}
	void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	char getDesignationCode() {
		return DesignationCode;
	}
	void setDesignationCode(char designationCode) {
		DesignationCode = designationCode;
	}
	String getDepartment() {
		return Department;
	}
	void setDepartment(String department) {
		Department = department;
	}
	int getBasic() {
		return Basic;
	}
	void setBasic(int basic) {
		Basic = basic;
	}
	int getHRA() {
		return HRA;
	}
	void setHRA(int hRA) {
		HRA = hRA;
	}
	int getIT() {
		return IT;
	}
	void setIT(int iT) {
		IT = iT;
	}
	public Entry(int empNo, String empName, String joinDate, char designationCode, String department, int basic,
			int hRA, int iT) {
		super();
		EmpNo = empNo;
		EmpName = empName;
		JoinDate = joinDate;
		DesignationCode = designationCode;
		Department = department;
		Basic = basic;
		HRA = hRA;
		IT = iT;
	}
	
}