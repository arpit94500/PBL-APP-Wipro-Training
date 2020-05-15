
public class Sample5 {

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
		int min[] = {num[0],num[1]};
	    int max[]= {num[count-2],num[count-1]};
		for(int i:max)
		{
			System.out.println(i);
		}
		for(int j:min)
		{
			System.out.println(j);
		}
	}

}
