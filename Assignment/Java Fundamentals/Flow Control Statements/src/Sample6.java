
public class Sample6 {

	public static void main(String[] args) {
		String g = args[0];
		double i =0;
		int a = Integer.parseInt(args[1]);
		if(g.equals("Male"))
		{
			if(a>=1 && a<=58)
			{
				i=8.4;
			}
			if(a>=59 && a<=100)
			{
				i=10.5;
			}
		}
		if(g.equals("Female"))
		{
			if(a>=1 && a<=58)
			{
				i=8.2;
			}
			if(a>=59 && a<=100)
			{
				i=9.2;
			}
		}
		System.out.println(i+"%");

	}

}
