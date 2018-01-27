
public class CarClass {
	public String manufacturarName;
	private String modelName;
	public int engineCC;
	public float carWeight;
	public float fuelAmount;
	private String password;
	
	public CarClass() {
		manufacturarName=new String();
		engineCC = 0;
		carWeight = 0;
		fuelAmount = 0;
	}
	public CarClass(String carName){
		manufacturarName=new String(carName);
		engineCC = 0;
		carWeight = 0;
		fuelAmount = 0;
	}
	public CarClass(String manufacturarName,String modelName,String pass,int engineCC,float carWeight,float fuelAmount){
		this.manufacturarName=manufacturarName;
		this.modelName=modelName;
		password=pass;
		this.engineCC=engineCC;
		this.carWeight=carWeight;
		this.fuelAmount=fuelAmount;
	}
	
	public float presentAmountOfFuel(){
		return fuelAmount;
	}
	public String getModelName(){
		return modelName;
	}
	public boolean getPassword(String userInput){
		return userInput.equals(password);
	}
}
