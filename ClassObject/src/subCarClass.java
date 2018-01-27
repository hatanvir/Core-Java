
public class subCarClass extends CarClass{
	private float ChargeInBattery;
	private String color;
	public subCarClass() {
		super();
	}
	
	public subCarClass(String manufacturarName,String modelName,String pass,int engineCC,float carWeight,float fuelAmount,float ChargeInBattery,String color){
		//super(manufacturarName,modelName,pass,engineCC,carWeight,fuelAmount);
		this.ChargeInBattery=ChargeInBattery;
		this.setColor(color);
	}
	
	public float getChargeInBattery() {
		return ChargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		ChargeInBattery = chargeInBattery;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
