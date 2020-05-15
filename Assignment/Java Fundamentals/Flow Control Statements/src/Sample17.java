
public class Sample17 {

	public static void main(String[] args) {
		int n =Integer.parseInt(args[0]);
		while(n>0)
		{
			int t= n%10;
			System.out.print(t);
			n=n/10;
		}
	}

}
