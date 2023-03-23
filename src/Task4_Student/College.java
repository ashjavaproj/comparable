package Task4_Student;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class College {
	//set all student data and add into set here
    Scanner sc=new Scanner(System.in);
    Student_SortBy_Name s1=new Student_SortBy_Name();
    Student_SortBy_Name s2=new Student_SortBy_Name();
	Set<Student_SortBy_Name> s=new TreeSet();
	public void addStudent()
	{
		System.out.println("Enter First Student Records");
		System.out.print("Rollno  = ");
		s1.setRollno(sc.nextInt());
		System.out.print("Name  = ");
		s1.setName(sc.next());
		
		System.out.println("Enter Second Student Records");
		System.out.print("Rollno  = ");
		s2.setRollno(sc.nextInt());
		System.out.print("Name  = ");
		s2.setName(sc.next());
		
		
		s.add(s1);
		s.add(s2);
		
	
	}
	public void viewStudent(){
	//get College
		College c=new College();
		System.out.println("  Rollno       Name");
		System.out.println("--------------------------");
		for(Student_SortBy_Name a:s)
		{
			System.out.print("  "+a.getRollno());
			System.out.print("       "+a.getName());
			System.out.println();
			
		}
	}
	}


