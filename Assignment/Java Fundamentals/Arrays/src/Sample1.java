
public class Sample1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4,6,5,7,8,9} ;
		int sum=0;
		double avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum="+sum);
		avg=((double)sum/arr.length);
		System.out.println("Average="+avg);
		
	}

}
