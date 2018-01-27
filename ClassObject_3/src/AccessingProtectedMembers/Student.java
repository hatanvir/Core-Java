package AccessingProtectedMembers;

public class Student {
	//private variable
	private int roll;
	private String name=new String();
	
	//getting data
	private void GetData(){ //private method
		roll = 161;
		name = "Tanvir";
	}
	//display data and call private method
	void display(){
		GetData();
		System.out.println("Roll is: "+roll);
		System.out.println("Name is: "+name);
	}
	//main
	public static void main(String[] args) {
		Student sc = new Student();
		sc.display();
	}

}
