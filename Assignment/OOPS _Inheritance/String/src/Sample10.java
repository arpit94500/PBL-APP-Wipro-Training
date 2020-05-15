
public class Sample10 {

	public static void main(String[] args) {
		String s ="Wipro";
		int n=3;
		StringBuffer sb = new StringBuffer();
		String temp = s.substring(s.length()-n);
		for(int i=0;i<n;i++)
		{
			sb.append(temp);
		}
		System.out.println(sb);
		
	}

}
