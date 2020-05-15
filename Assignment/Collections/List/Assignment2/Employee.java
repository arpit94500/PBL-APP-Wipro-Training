public class Employee {
	private int empId; 
	private String empName;
	private String email; 
	private String gender;
	private float salary;
	
	public Employee() {}

	public Employee(int empId, String empName, String email, char gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}

	public void GetEmployeeDetails() {
		System.out.println("Employee : EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail 
				+ ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + );
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		email = empEmail;
	}

	public char getEmpGender() {
		return EmpGender;
	}

	public void setEmpGender(char empGender) {
		gender = empGender;
	}

	public float getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(float empSalary) {
		salary = empSalary;
	}
	
	
}