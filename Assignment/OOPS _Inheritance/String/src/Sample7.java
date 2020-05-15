
public class Sample7 {
	static String print(String s)
	{
		String temp=s;
		if(s.charAt(0)=='x')
		{
			temp = s.substring(1);
		}
		if(s.charAt(s.length()-1)=='x')
		{
			temp= temp.substring(0,temp.length()-1);
		}
		return temp;
			
	}
	public static void main(String[] args) {
		String s = "xHix";
		String s2 ="America";
		System.out.println(Sample7.print(s));
		System.out.println(Sample7.print(s2));
	}

}
