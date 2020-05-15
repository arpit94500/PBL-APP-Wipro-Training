
public class Sample12 {

	public static void main(String[] args) {
		int n = 12;//Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<=(n/2)+1;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
		

	}

}
