
import java.util.ArrayList; 

class Employee
{ 
	int eid;
	String name;
} 

class Test implements Cloneable 
{ 
	int a; 
	int b; 
	Employee c = new Employee(); 
	public Object clone() throws
				CloneNotSupportedException 
	{ 
		return super.clone(); 
	} 
} 

public class Main 
{ 
	public static void main(String args[]) throws
						CloneNotSupportedException 
	{ 
	Test t1 = new Test(); 
	t1.a = 10; 
	t1.b = 20; 
	t1.c.eid = 30; 
	t1.c.name = "arpit"; 

	Test t2 = (Test)t1.clone(); 

	t2.a = 100; 

	t2.c.name = "Shubham"; 
	t2.c.eid = 20;

	// Change in object type field will be 
	// reflected in both t2 and t1(shallow copy) 
	System.out.println(t1.a + " " + t1.b + " " + 
						t1.c.eid + " " + t1.c.name); 
	System.out.println(t2.a + " " + t2.b + " " + 
						t2.c.eid + " " + t2.c.name); 
	} 
} 
