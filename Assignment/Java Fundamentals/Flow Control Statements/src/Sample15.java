
public class Sample15 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum=0;
		for(int i =n; i>0;i=i/10)
		{
			sum=sum+(i%10);
		}
		System.out.println(sum);

	}

}
