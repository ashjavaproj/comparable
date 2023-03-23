package Task2_Employee;



import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	Scanner sc=new Scanner(System.in);
	
	public void EidWiseSort(){
		
		Employee_SortBy_EID id1=new Employee_SortBy_EID();
		Employee_SortBy_EID id2=new Employee_SortBy_EID();
		Set<Employee_SortBy_EID> s1=new TreeSet<>();	
		
		System.out.println("Enter First Employee Records");
		System.out.print("Eid       = : ");
		id1.setEmid(sc.nextInt());
		System.out.print("EName       = : ");
		id1.setEmname(sc.next());
		System.out.print("ESalary      = : ");
		id1.setSalary(sc.nextDouble());
		
		System.out.println("Enter Second Employee Records");
		System.out.print("Eid       = : ");
		id2.setEmid(sc.nextInt());
		System.out.print("EName       = : ");
		id2.setEmname(sc.next());
		System.out.print("ESalary      = : ");
		id2.setSalary(sc.nextDouble());
		
		s1.add(id1);
		s1.add(id2);
		
		for(Employee_SortBy_EID o:s1)
		{
			
			System.out.println("   ID          Ename         Salary" );
			System.out.println("--------------------------------------------");
		
			System.out.print("   "+o.getEmid());
			System.out.print("   "+o.getEmname());
			System.out.print("   "+o.getSalary());
	}
	}
	public void NameWiseSort()
	{
		Employee_SortBy_Ename nm1=new Employee_SortBy_Ename();
		Employee_SortBy_Ename nm2=new Employee_SortBy_Ename();
		Set<Employee_SortBy_Ename> s2=new TreeSet<>();	
		
		System.out.println("Enter First Employee Records");
		System.out.print("Eid       = : ");
		nm1.setEmid(sc.nextInt());
		System.out.print("EName       = : ");
		nm1.setEmname(sc.next());
		System.out.print("ESalary      = : ");
		nm1.setSalary(sc.nextDouble());
		
	
		System.out.println("Enter Second Employee Records");
		System.out.print("Eid       = : ");
		nm2.setEmid(sc.nextInt());
		System.out.print("EName       = : ");
		nm2.setEmname(sc.next());
		System.out.print("ESalary      = : ");
		nm2.setSalary(sc.nextDouble());
		
		s2.add(nm1);
		s2.add(nm2);
		
		for(Employee_SortBy_Ename o:s2)
		{
			
			System.out.println("   ID          Ename         Salary" );
			System.out.println("--------------------------------------------");
		
			System.out.print("   "+o.getEmid());
			System.out.print("   "+o.getEmname());
			System.out.print("   "+o.getSalary());
		}
	}
	public void SalaryWiseSort()
	{
		Employee_SortBy_Esalary sal1=new Employee_SortBy_Esalary();
		Employee_SortBy_Esalary sal2=new Employee_SortBy_Esalary();	
		Set<Employee_SortBy_Esalary> s3=new TreeSet<>();	
		
		System.out.println("Enter First Employee Records");
		System.out.print("Eid       = : ");
		sal1.setEmid(sc.nextInt());
		System.out.print("EName       = : ");
		sal1.setEmname(sc.next());
		System.out.print("ESalary      = : ");
		sal1.setSalary(sc.nextDouble());
		
	
		System.out.println("Enter Second Employee Records");
		System.out.print("Eid       = : ");
		sal2.setEmid(sc.nextInt());
		System.out.print("EName       = : ");
		sal2.setEmname(sc.next());
		System.out.print("ESalary      = : ");
		sal2.setSalary(sc.nextDouble());
		
		s3.add(sal1);
		s3.add(sal2);
		
		for(Employee_SortBy_Esalary o:s3)
		{
			
			System.out.println("   ID          Ename         Salary" );
			System.out.println("--------------------------------------------");
		
			System.out.print("   "+o.getEmid());
			System.out.print("   "+o.getEmname());
			System.out.print("   "+o.getSalary());
	}
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println(" 1 = ID Wise Employee Records"); 
			System.out.println(" 2 = Name Wise Employee Records");
			System.out.println(" 3 = Salary Wise Employee Records");
			System.out.println(" 4 = EXIT");
			System.out.print("Enter UR Choice : ");
			int ch1=sc.nextInt();
			switch(ch1)
			{
			case 1: t.EidWiseSort();break;
			case 2: t.NameWiseSort();break;
			case 3: t.SalaryWiseSort(); break;
			case 4: System.exit(0);				
			break;
			}
	
		}
		
	}
		}
		
		

		
		 
		
		
		
		
		
		
		
		
	
		
		
		
		
		 
		
			