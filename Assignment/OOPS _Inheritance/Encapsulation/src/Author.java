
public class Author {

	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	char getGender() {
		return gender;
	}

	void setGender(char gender) {
		this.gender = gender;
	}



}
