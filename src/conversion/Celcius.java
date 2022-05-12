package conversion;

public class Celcius {

	public String curr_scale;
	public double value;
	public String target_scale;


	public Celcius(double value, String target_scale) {
		super();
		this.value = value;
		this.target_scale = target_scale;
	}

	public void convert() {
		if(target_scale.equals("F")){
			double f_value=value*1.8+32;
			System.out.println(value+ " Degrees Celsius is equal to "+f_value+" Fahrehheit ");
		}else if(target_scale.equals("K")){
			double k_value=value+273.15;
			System.out.println(value+ " Degrees Celsius is equal to "+k_value+" Kelvin ");
		}


	}
}
