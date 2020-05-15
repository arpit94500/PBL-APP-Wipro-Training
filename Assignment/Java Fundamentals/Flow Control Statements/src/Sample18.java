
public class Sample18 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int a=n;
		int rn =0;
		while(n>0)
		{
			int t = n%10;
			rn = rn*10+t;
			n=n/10;
			
		}
		if(rn==a)
		{
			System.out.println(a+" is a palindrome");
		}
		else
		{
			System.out.println(a+" is not a palindrome");
		}

	}

}
