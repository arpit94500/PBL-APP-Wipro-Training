package School;

class Teacher extends Person {
	private double salary;
	private String subject;
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	String getSubject() {
		return subject;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	

}
