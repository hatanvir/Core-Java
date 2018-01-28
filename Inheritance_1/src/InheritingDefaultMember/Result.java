package InheritingDefaultMember;

public class Result extends Student{ //Inheriting class
	float cgpa;
	
	void GetData(){
		name = "Tanvir";
		id = 161;
		cgpa = 3.5f;
	}
	void Display(){
		System.out.println("Name is: "+name);
		System.out.println("Id is: "+id);
		System.out.println("Cgpa is: "+cgpa);
	}
}
