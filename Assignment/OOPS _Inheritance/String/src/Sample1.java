
public class Sample1 {

	public static void main(String[] args) {
		String s = "Madam";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		if(s.equalsIgnoreCase(sb.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
