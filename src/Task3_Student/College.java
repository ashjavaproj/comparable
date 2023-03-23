package Task3_Student;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class College {
	public Set<Object> m1(){
		//set all student data and add into set here
		Student_SortBy_SID id1=new Student_SortBy_SID();
		Student_SortBy_SID id2=new Student_SortBy_SID();
		
		Student_SortBy_Sname nm1=new Student_SortBy_Sname();
		Student_SortBy_Sname nm2=new Student_SortBy_Sname();
		
		
		id1.setRollno(101);
		id1.setName("Ketaki");
		
		id2.setRollno(201);
		id2.setName("jeeja");
		
		nm1.setRollno(101);
		nm1.setName("Ketaki");
		
		nm2.setRollno(201);
		nm2.setName("jeeja");
		
		List<Student_SortBy_SID> stu1=new ArrayList<>();
		stu1.add(id1);
		stu1.add(id2);
		
		List<Student_SortBy_Sname> stu2=new ArrayList<>();
		stu2.add(nm1);
		stu2.add(nm2);
		
		Set<Object> mix=new TreeSet<>();
		mix.add(stu1);
		mix.add(stu2);
		
		
		return mix;
		
		}
		

}
