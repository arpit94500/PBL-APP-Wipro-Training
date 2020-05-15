
class Fruit {
	String name;
	String taste;
	String size;
	
	public Fruit(String name, String taste, String size) {
		super();
		this.name = name;
		this.taste = taste;
		this.size = size;
	}

	void eat()
	{
		System.out.println("The name of the fruit is:"+name);
		System.out.println("The taste of fruit is:"+taste);
		
	}
}
