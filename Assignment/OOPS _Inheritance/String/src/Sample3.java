
public class Sample3 {
	public static void main(String[] args) {
		String s = "Wipro";
		int n = s.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++)
		{
			sb.append(s.substring(0, 2));
		}
		System.out.println(sb);
	}

}
