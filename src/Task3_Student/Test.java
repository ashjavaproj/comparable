package Task3_Student;

import java.util.Set;

public class Test {
	public static void main(String[] args) {
		//get all data here.
		College c=new College();
		
		Set<Object> data=c.m1();
		System.out.println("  Rollno          Name  ");
		System.out.println("------------------------------");
		
		for(Object a:data)
		{

			Object o=a;
			if(o instanceof Student_SortBy_SID)
			{
				Student_SortBy_SID x=(Student_SortBy_SID) o;
			
				System.out.print("   "+x.getRollno());
				System.out.print("         "+x.getName());
				System.out.println();
			}
			else if(o instanceof Student_SortBy_Sname)
			{
				Student_SortBy_Sname x=(Student_SortBy_Sname) o;
				
				System.out.print("   "+x.getRollno());
				System.out.print("         "+x.getName());
				System.out.println();
			}
		
		}
		}
}

