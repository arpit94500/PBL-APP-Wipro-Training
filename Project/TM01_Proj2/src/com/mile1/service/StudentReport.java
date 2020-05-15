package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
public class StudentReport 
{
	public String findGrade (Student studentObject)
	{
		String grade="";
		int sum=0;
		int s[]=studentObject.getMarks();
		for(int i=0;i<s.length;i++)
		{
//			System.out.println(s[i]);
			if(s[i]<35)
				return grade="F";
			else
				sum+=s[i];
		}		
//		System.out.println(sum);
	    if(sum<=150 && sum!=0)
			grade=" D";
		else if(sum>150 && sum<=200)
			grade=" C";
		else if(sum>200 && sum<=250)
			grade=" B";
		else if(sum>250 && sum<=300)
			grade=" A";
		else
			grade="";
		return grade;
	}	
	public String validate (Student studentObject) 
			throws NullStudentException, NullNameException, NullMarksArrayException 
	{
		String x="";
		if(studentObject==null)
			throw new NullStudentException();
		else if(studentObject.getName()==null)
			throw new NullNameException();
		else if(studentObject.getMarks()==null)
			throw new NullMarksArrayException();
		else
			x=findGrade(studentObject);
		return x;
	}		 
}
