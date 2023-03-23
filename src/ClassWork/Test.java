package ClassWork;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String args[])
	{
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		
		
		s.setRno(102);
		s.setName("Anu");
		
		s1.setRno(101);
		s1.setName("Rupali");
		
		s2.setRno(103);
		s2.setName("Rakhi");
		
		s3.setRno(104);
		s3.setName("Saniya");
		
		s4.setRno(103);
		s4.setName("Rakhi");
		
		s5.setRno(121);
		s5.setName("Sakshi");
		
		
		Set<Student> stu=new TreeSet<>();
		
		stu.add(s);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		
		
		for(Student a:stu)
		{
			System.out.print(a.getRno()+"   ");
			System.out.println(a.getName());
		}
	}
}
