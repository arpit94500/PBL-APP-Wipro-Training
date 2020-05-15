
public class Sample2 {

	public static void main(String[] args) {
		int arr[] = {2,1,2,3,4,4,6,5,7,8,9} ;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum="+max);
		System.out.println("Minimum="+min);

	}

}
