
public class Sample10 {

	public static void main(String[] args) {
		if(args.length<9)
		{
			System.out.println("Please enter 9 integer numbers");
		}
		else
		{
			
			int a[][]=new int[9][9];
			int k=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					a[i][j]= Integer.parseInt(args[k]);
					k++;
				}
			}
			int max=a[0][0];
			System.out.println("The given array is :");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
					if(max<a[i][j])
					{
						max = a[i][j];
					}
				}
				System.out.println();
			}
			System.out.println("The biggest number in the given array is "+ max);
		}

	}
}
