package conversion;

public class Fahrenheit {

	public String curr_scale;
	public double value;
	public String target_scale;
	
	public Fahrenheit(double value, String target_scale) {
		super();
		this.value = value;
		this.target_scale = target_scale;
	}
	
	public void convert() {
		if(target_scale.equals("C")){
			double c_value = (value - 32) * (5/9);
			System.out.println(value+ " Degrees Fahrehheit is equal to "+c_value+" Celsius ");

		}else if(target_scale.equals("K")){
			double k_value = (value - 32)*(5/9) + 273.15;
			System.out.println(value+ " Degrees Fahrehheit is equal to "+k_value+" Kelvin ");
		}
	}
}
