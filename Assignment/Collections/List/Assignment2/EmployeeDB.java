public class EmployeeDB {
	ArrayList<Employee> empDB = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e) {
		return empDB.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = empID.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid Employee ID ";
		
		Iterator<Employee> it = empID.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			if(emp.getEmpId() == empId) 
				paySlip = "Pay Slip for Employee"+empId+" is "+emp.getEmpSalary();
		}
	}
		public Employee[] listAll() {
		Employee[] empArray = new Employee[empDB.size()];
		for (int i = 0; i < empDB.size(); i++)
			empArray[i] = empDB.get(i);
		return empArray;
	}
	
}