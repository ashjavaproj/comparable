package Task2_Employee;

public class Employee_SortBy_EID implements Comparable<Employee_SortBy_EID>{
	private int emid;
	private String emname;
	private double salary;
	//setter/getter
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEmname() {
		return emname;
	}
	public void setEmname(String emname) {
		this.emname = emname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee_SortBy_EID o) {
		// TODO Auto-generated method stub
		return this.emid-o.emid;
	}

}
