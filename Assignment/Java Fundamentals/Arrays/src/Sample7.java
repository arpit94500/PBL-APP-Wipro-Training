import java.util.Arrays;

public class Sample7 {

	public static void main(String[] args) {
		int arr[] = {12,34,12,45,67,89};
		int l = arr.length;
		int temp[] = new int[l];
		int j=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		for(int i=0;i<j;i++)
		{
		System.out.println(arr[i]);
		}

		

	}

}
