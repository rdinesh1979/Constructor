package ParameterizedConstructor;

class Applicant {
	
	public Applicant(String n, int e, double es)
	{
		
		System.out.println("Name: "+n);
		System.out.println("Experience: "+e);
		System.out.println("Expected Salary: "+es);
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		new Applicant("Dinesh",10,75000.65);
		
		//Applicant a = new Applicant("Dinesh",10,75000.65);

	}

}
