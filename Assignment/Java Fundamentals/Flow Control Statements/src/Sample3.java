
public class Sample3 {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("No Values");
		}
		else
		{
			for(String s:args)
			{
				System.out.print(s+",");
			}
		}

	}

}
