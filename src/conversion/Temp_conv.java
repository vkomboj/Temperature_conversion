package conversion;
public class Temp_conv {

	public static void main(String[] args) {

		try {
			String current_scale = args[0];
			double value = Double.parseDouble(args[1]);
			String target_scale = args[2];

			if(current_scale.equals("C")) {
				Celcius c=new Celcius(value,target_scale);
				c.convert();
			}
			else if(current_scale.equals("F")){
				Fahrenheit f=new Fahrenheit(value,target_scale);
				f.convert();

			}else if(current_scale.equals("K")){
				Kelvin k=new Kelvin(value,target_scale);
				k.convert();
			}

		}catch(NumberFormatException e){
			System.out.println("Invalid Format ! Please Try Again");
			System.exit(-1);
		}catch(Exception e) {
			System.out.println("Something went Wrong ! Please Try Again");
		}

	}

}
