package conversion;

public class Kelvin {



	public String curr_scale;
	public double value;
	public String target_scale;


	public Kelvin(double value, String target_scale) {
		super();
		this.value = value;
		this.target_scale = target_scale;
	}

	public void convert() {
		if(target_scale.equals("C")){
			double C_value = value - 273.15;
			System.out.println(value+ " Degrees Kelvin is equal to "+C_value+" Celsius ");

		}else if(target_scale.equals("F")){
			double f_value = (value - 273.15) * (9/5) + 32;
			System.out.println(value+ " Degrees Kelvin is equal to "+f_value+" Fahrehheit ");
		}
	}
}
