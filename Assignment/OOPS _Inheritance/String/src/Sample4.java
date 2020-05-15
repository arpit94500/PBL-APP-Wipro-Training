
public class Sample4 {
	static String print(String s)
	{
		if(s.length()%2==0)
		{
			return s.substring(0, s.length()/2);
		}
		else
			return null;

	}

	public static void main(String[] args) {
		String s = "TomCat";
		System.out.println(Sample4.print(s));
		String st = "Apron";
		System.out.println(Sample4.print(st));
		
		
	}

}
