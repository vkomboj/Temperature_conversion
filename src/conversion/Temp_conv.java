package conversion;
public class Temp_conv {

	public static void main(String[] args) {
		//C 25 k
		System.out.println("Temperature Conversion Application");
		System.out.println("Please Enter the Current Scale and value of that scale and then");
		System.out.println("Enter the Target Scale in which you want the Temperature to Be Converted");
		System.out.println("Like current_scale=C value=25 target_scale=K");
		System.out.println("This will give you output like ");
		System.out.println("25 Degrees Celsius is equal to 298.15 Kelvin");
		System.out.println(".............................................");

	
		char current_scale = args[0].charAt(0);
		double value = Double.parseDouble(args[1]);
		char target_scale = args[2].charAt(0);

		if(current_scale == 'C') {
			if(target_scale == 'F'){
               double f_value=value*1.8+32;
               System.out.println(value+ " Degrees Celsius is equal to "+f_value+" Fahrehheit ");
			}else if(target_scale == 'K'){
				double k_value=value+273.15;
				System.out.println(value+ " Degrees Celsius is equal to "+k_value+" Kelvin ");
			}
		}
		else if(current_scale == 'F'){
			if(target_scale == 'C'){
				double c_value = (value - 32) * (5/9);
				System.out.println(value+ " Degrees Fahrehheit is equal to "+c_value+" Celsius ");

			}else if(target_scale == 'K'){
				double k_value = (value - 32)*(5/9) + 273.15;
				System.out.println(value+ " Degrees Fahrehheit is equal to "+k_value+" Kelvin ");
			}

		}else if(current_scale == 'K'){
			if(target_scale == 'C'){
				double C_value = value - 273.15;
				System.out.println(value+ " Degrees Kelvin is equal to "+C_value+" Celsius ");

			}else if(target_scale == 'F'){
				double f_value = (value - 273.15) * (9/5) + 32;
				System.out.println(value+ " Degrees Kelvin is equal to "+f_value+" Fahrehheit ");
			}

		}

	}

}
