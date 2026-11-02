package chapter5.program1;

public abstract class Employee {
	String name;
	String department;
	
	public Employee(String name, String department) {
		this.name = name;
		this.department = department;	
	}
	
	public abstract void showInfo();
}
