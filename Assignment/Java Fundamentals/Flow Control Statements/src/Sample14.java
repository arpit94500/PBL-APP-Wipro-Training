
public class Sample14 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
		int n = Integer.parseInt(args[0]);
		if(n==0 || n==1)
		{
			System.out.println(n+" is neither prime nor composite");
		}
		else
		{
			int flag=0;
			for(int i=2;i<(n/2)+1;i++)
			{
				if(n%i==2)
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(n+" is not a prime number");
			}else
			{
				System.out.println(n+ " is a prime number");
			}
		}
		}
		
		
	}

}
