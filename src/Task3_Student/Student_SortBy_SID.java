
package Task3_Student;

public class Student_SortBy_SID implements Comparable<Student_SortBy_SID>{
	
		private int rollno;
		private String name;
		//setter/getter
		
		

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(Student_SortBy_SID o) {
			// TODO Auto-generated method stub
			return this.rollno-o.rollno;
		}
		}


