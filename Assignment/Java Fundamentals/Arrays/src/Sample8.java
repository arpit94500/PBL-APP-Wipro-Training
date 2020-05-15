
public class Sample8 {

	public static void main(String[] args) {
		int arr[] = {1,6,4,7,9};
		int six=0,seven=0,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==6)
			{
				six=i;
			}
			if(arr[i]==7)
			{
				seven=i;
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(six<seven)
			{
				if(i>=six && i<=seven)
				{
					continue;
				}
				else
				{
					sum=sum+arr[i];
				}
			}
			else
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
