package DefaultConstructor;

class Student {
	public Student()
	
	{
		System.out.println("This is Constructor Demo");
		System.out.println("This is Default Constructor");
	} 

    void display()
    {
    	System.out.println("This is a Normal Method");
    }
}

public class MainClass {

	public static void main(String[] args) {

		Student s = new Student();
		s.display();

	}
}
