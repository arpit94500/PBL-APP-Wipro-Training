import java.util.*;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee : id= " + id + ", name= " + name + ", address= " + address + ", salary= " + salary ;
	}
}

public class Main {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Akhil", "2nd, India", 230000.0));
		list.add(new Employee(102, "Akshay", "8th street, India", 340000.0));
		list.add(new Employee(103, "Srinath", "12th street, India", 265000.0));
		list.add(new Employee(104, "Bobby", "14th street, India", 420000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}