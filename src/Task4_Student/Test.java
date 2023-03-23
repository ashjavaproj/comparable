package Task4_Student;

import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	
	 public static void main(String[] args) {
		//give the input from user for choice
		 Scanner sc=new Scanner(System.in);
		 College cl=new College();
		 while(true)
		 {
			 System.out.println();
		 System.out.println("1=Insert Records");
		 System.out.println("2=Display Records");
		 System.out.print("Enter Choice  :  ");
		 int ch=sc.nextInt();
		 
		 
		 switch(ch)//only call all methods here.
		{
		
		case 1:cl.addStudent();break;
		
		case 2:cl.viewStudent();break;
			
		}
		}
		}
		}




