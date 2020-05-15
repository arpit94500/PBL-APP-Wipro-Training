
public class Patient {
	String patientName;
	double height;
	double weight;
	
	public Patient(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	double computeBMI()
	{
		double bmi = weight/(height*height);
		return bmi;
	}

	public static void main(String[] args) {
		Patient p = new Patient("Arpit",1.72,60);
		double bmi = p.computeBMI();
		System.out.println(bmi);

	}

}
