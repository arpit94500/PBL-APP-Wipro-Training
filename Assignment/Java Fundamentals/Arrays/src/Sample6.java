
public class Sample6 {

	public static void main(String[] args) {
		int num[] = {10,34,1,2,3,34,435,23,21,212,32,43254,999999,211,343};
		int count = num.length;
		for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
		
		for(int i:num)
		{
			System.out.println(i);
		}
		
	}

}
