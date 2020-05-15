package com.employees.tm1;
import java.util.*;
public class Employees {

	private int print(int n,String name,String d,String De, int s)
	{
		System.out.println("Emp No.\tEmp Name \tDepartment\t  Designation\t  Salary");
		System.out.println(n+"\t"+name+"  \t"+d+"\t\t"+De+"\t"+s);
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Entry e[] = new Entry[7];
		e[0]= new Entry(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
		e[1]= new Entry(1002,"Shushma","23/08/2012",'c',"PM",30000,12000,9000);
		e[2]= new Entry(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
		e[3]= new Entry(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
		e[4]= new Entry(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
		e[5]= new Entry(1006,"Suman","1/1/2000",'e',"Manufacturing",23000,9000,4400);
		e[6]= new Entry(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);
		
		int flag=0;
		
		Designation d[]= new Designation[5];
		d[0]=new Designation('e',"Enginner",20000);
		d[1]=new Designation('c',"Consultant",32000);
		d[2]=new Designation('k',"Clerk",12000);
		d[3]=new Designation('r',"Receptionist",15000);
		d[4]=new Designation('m',"Manager",40000);
		for(Entry i:e)
		{
			if(i.getEmpNo()==n)
			{
				char dc= i.getDesignationCode();
				String de="";
				int da=0;
				for(Designation j:d)
				{
					if(dc==j.getDesignationCode())
					{
						da = j.getDA();
						de = j.getDesignation();
					}
				}
				int Salary = i.getBasic()+i.getHRA()+ da -i.getIT();
				flag = new Employees().print(n,i.getEmpName(),i.getDepartment(),de,Salary);
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("There is no employee with empid: "+n);
		}
		

	}

}
