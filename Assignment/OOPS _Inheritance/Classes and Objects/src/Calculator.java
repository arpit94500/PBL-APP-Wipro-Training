
public class Calculator {

	static int powerInt(int num1,int num2) {
		int r = (int) Math.pow(num1, num2);
		return r;
	}
	static double powerDouble(double num1,int num2) {
		double r = Math.pow(num1, num2);
		return r;
	}
	
	public static void main(String[] args) {
		int f = Calculator.powerInt(20, 5);
		double s = Calculator.powerDouble(20.40, 3);
		System.out.println(f);
		System.out.println(s);

	}

}
