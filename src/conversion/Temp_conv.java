package conversion;
import java.util.*;
public class Temp_conv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char current_scale = sc.next().charAt(0);
		double value = sc.nextDouble();
		char target_scale = sc.next().charAt(0);

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
				System.out.println(value+ " Degrees Celsius is equal to "+c_value+" Kelvin ");

			}else if(target_scale == 'K'){
				double k_value = (value - 32)*(5/9) + 273.15;
				System.out.println(value+ " Degrees Celsius is equal to "+k_value+" Kelvin ");
			}

		}else if(current_scale == 'K'){
			if(target_scale == 'C'){
				double C_value = value - 273.15;
				System.out.println(value+ " Degrees Celsius is equal to "+C_value+" Kelvin ");

			}else if(target_scale == 'F'){
				double f_value = (value - 273.15) * (9/5) + 32;
				System.out.println(value+ " Degrees Celsius is equal to "+f_value+" Kelvin ");
			}

		}
		sc.close();

	}

}
