package MethodOverloading;

public class FindArea {
	//Default variable
	 int leangth;
	 int breadth;
	 int area;
	
	 //Method overloading
	public void Area(int n){
		leangth = n;
		breadth = n;
		area = leangth*breadth;
		System.out.println("Leangth is: "+leangth);
		System.out.println("Breadh is: "+breadth);
		System.out.println("Area of the room is: "+area);
	}
	// //Method overloading
	public void Area(int m,int n){
		leangth = m;
		breadth = n;
		area = leangth*breadth;
		System.out.println("Leangth is: "+leangth);
		System.out.println("Breadh is: "+breadth);
		System.out.println("Area of the room is: "+area);
	}
}
