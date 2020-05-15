
public class Sample11 {

	public static void main(String[] args) {
		String s1 = "abcXY123XYijk";
		String s2 ="XY";
		StringBuffer sb = new StringBuffer(); 
		int i=0;
		if(s1.contains(s2))
		{
			i=s1.indexOf(s2, i);
			
			while(i!=-1)
			{
				if(i-1>0)
				sb.append(s1.charAt(i-1));
				if(i+s2.length()<s1.length()-1)
				sb.append(s1.charAt(i+s2.length()));
				i=s1.indexOf(s2, i+1);
				
			}
			
		}
		System.out.println(sb);

	}

}
