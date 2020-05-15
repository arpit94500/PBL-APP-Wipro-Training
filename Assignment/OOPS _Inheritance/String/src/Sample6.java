
public class Sample6 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hi";
		String s3;
		if(s1.length()>s2.length())
		{
			s3=s2.concat(s1).concat(s2);
		}
		else
		{
			s3 = s1.concat(s2).concat(s1);
		}
		System.out.println(s3);

	}

}
