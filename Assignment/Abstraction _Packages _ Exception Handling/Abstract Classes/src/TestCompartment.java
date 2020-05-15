import java.util.*;
public class TestCompartment {

	public static void main(String[] args) {
		Compartment c[] = new Compartment[10];
		Scanner sc = new Scanner(System.in);
		int temp;
		for(int i=0;i<10;i++)
		{
			temp = sc.nextInt();
			switch(temp){
				case 1:
					c[i]= new FirstClass();
					break;
				case 2:
					c[i]= new Ladies();
					break;
				case 3:
					c[i]= new General();
					break;
				case 4:
					c[i]= new Luggage();
					break;
					
			}
			System.out.println(c[i].notice());
					
		}

	}

}
