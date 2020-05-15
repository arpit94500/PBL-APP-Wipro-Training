
public class Sample9 {

	public static void main(String[] args) {
		if(args.length<4)
		{
			System.out.println("Please enter 4 integer numbers");
		}
		else
		{
			int k=3;
			int a[][]=new int[2][2];
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					a[i][j]= Integer.parseInt(args[k]);
					k--;
				}
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
