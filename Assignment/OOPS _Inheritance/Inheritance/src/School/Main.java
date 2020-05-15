package School;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Person Details");
		
		Person p = new Person();
		p.setName("Arpit");
		p.setDateofBirth("06/08/1999");
		System.out.println(p.getName());
		System.out.println(p.getDateofBirth());
		
		System.out.println("Teacher Details");
		
		Teacher t = new Teacher();
		t.setDateofBirth("06/08/1565");
		t.setName("Rahul");
		t.setSalary(120000);
		t.setSubject("Java");
		System.out.println(t.getName());
		System.out.println(t.getSubject());
		System.out.println(t.getDateofBirth());
		System.out.println(t.getSalary());
		
		System.out.println("Student Details");
		
		Student s = new Student();
		s.setDateofBirth("06/08/1965");
		s.setName("Rahul Mishra");
		s.setsId(112256);;
		System.out.println(s.getName());
		System.out.println(s.getDateofBirth());
		System.out.println(s.getsId());
		
        System.out.println("College Student Details");
		
		CollegeStudent c = new CollegeStudent();
		c.setDateofBirth("06/08/1865");
		c.setName("Rahul Gupta");
		c.setsId(112256);
		c.setCollegeName("KCC ITM");
		c.setYear("First");
		System.out.println(c.getName());
		System.out.println(c.getDateofBirth());
		System.out.println(c.getsId());
		System.out.println(c.getCollegeName());
		System.out.println(c.getYear());


	}

}
