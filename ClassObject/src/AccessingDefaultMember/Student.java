package AccessingDefaultMember;

public class Student {
	
	//Default MEmber
	int roll;
	String name;
	float mark;
	
	void GetData(){ //Public Method for getting data 
		roll = 161018042;
		name = "Tanvir";
		mark = 70.50f;
	}
	 void display(){ //Public Method for display information
		System.out.println("Your roll is: "+roll);
		System.out.println("Your name is: "+name);
		System.out.println("Your mark is: "+mark);
	}
	public static void main(String[] args) {
		// Object Declaration
		Student sc = new Student();
		sc.GetData();
		sc.display();
	}
	
}
