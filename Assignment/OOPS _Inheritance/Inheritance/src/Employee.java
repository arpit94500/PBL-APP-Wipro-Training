
public class Employee extends Person {
	double annualSalary;
	int year;
	String iNo;
	public Employee(String name, double annualSalary, int year, String iNo) {
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.iNo = iNo;
	}
	double getAnnualSalary() {
		return annualSalary;
	}
	void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	String getiNo() {
		return iNo;
	}
	void setiNo(String iNo) {
		this.iNo = iNo;
	}
	
}
