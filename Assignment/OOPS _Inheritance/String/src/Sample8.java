
public class Sample8 {

	public static void main(String[] args) {
		String s = "ab*cd";
		int n = s.indexOf('*');
		StringBuffer temp = new StringBuffer();
		temp=temp.append(s.substring(0, n-1)).append(s.substring(n+2));
		System.out.println(temp);

	}

}
