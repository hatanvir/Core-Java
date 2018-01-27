
public class LearningClass {
	
	private int Number=12;
	static public subCarClass ourCar;
	static public CarClass anotherCarClass;
	public static void main(String[] args) {
		
		anotherCarClass = new CarClass("TOYOTA","Allion","123",1200,100,300);
		ourCar = new subCarClass("Toyota", "Allien", "123", 1200, 100,300,30, "REd");
		System.out.println("Manufacturar: "+anotherCarClass.carWeight);
		System.out.println("Model name: "+anotherCarClass.getModelName());
		System.out.println(anotherCarClass.getPassword("124"));
		System.out.println("\n\n");
		
		System.out.println("Manufacturar: "+ourCar.carWeight);
		System.out.println("Model name: "+ourCar.getModelName());
		System.out.println("Charge in battery: "+ourCar.getChargeInBattery());
		System.out.println("Color of car: "+ourCar.getColor());
		System.out.println(anotherCarClass.getPassword("124"));
	}

}
