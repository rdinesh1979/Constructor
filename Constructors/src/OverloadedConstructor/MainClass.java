package OverloadedConstructor;

//Overloading: All method names are same but parameters (arguments) should be different.

class Employee 
{
	public Employee()
	{
		System.out.println("Explaining about Constructor Overloading");
	}
	
	public Employee(int id)
	{
		System.out.println("Employee id: "+id);
	}
	
	public Employee(String n)
	{
		System.out.println("Employee name: "+n);
	}
	
	public Employee(int pd, int bp)
	{
		System.out.println("Present Days: " + pd);
		System.out.println("Basic Pay: "+bp);
		
		int total;
		total = pd*bp;
		System.out.println("Total Salary is: "+total);

	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		// Employee e = new Employee();
		
		new Employee();
		
		new Employee(156);
		
		new Employee("Dinesh");
		
		new Employee(30,2500);
	}

}
