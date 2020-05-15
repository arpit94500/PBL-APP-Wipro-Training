
public class Sample2 {

	public static void main(String[] args) {
		String s= "Mark,kate";
		//String s= "Sachin, Tendulkar";
		String str[] = s.split(",");
		if(str[0].charAt(str[0].length()-1)== str[1].charAt(0))
		{
			String temp = str[1].substring(1);
			StringBuffer sb = new StringBuffer(str[0]);
			sb.append(temp);
			System.out.println(sb);
		}
		else
		{
			StringBuffer sb = new StringBuffer(str[0]);
			for(String i: str)
			sb.append(i);
			System.out.println(sb);
		}
		
		

	}

}
