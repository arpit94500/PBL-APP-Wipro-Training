
public class Sample3 {

	public static void main(String[] args) {
		int arr[]={1,4,34,56,7};

		int n=34;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				flag=1;
				System.out.println(i);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("-1");
		}

	}

}
