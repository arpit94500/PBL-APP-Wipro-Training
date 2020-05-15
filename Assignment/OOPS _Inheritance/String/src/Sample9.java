
public class Sample9 {

	public static void main(String[] args) {
		String s = "Hello,World";
		String st[] = s.split(",");
		StringBuffer sb = new StringBuffer();
		int i= st[0].length();
		int j= st[1].length();
		if(i==j)
		{
			int t=0;
			while(i!=0)
			{
				sb.append(st[0].charAt(t)).append(st[1].charAt(t));
				t++;
				i--;
			}
			System.out.println(sb);
		}

	}

}
