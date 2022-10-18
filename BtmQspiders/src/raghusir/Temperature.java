package raghusir;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the temperature in celcius");
		float temp=s.nextFloat();
		float feran=(temp*9/5)+32;
		System.out.println(temp+"degree celcius is equals to "+feran+" degree faranheiht");
		System.out.println(temp+"degree celcius is equals to "+(temp+273.15)+"degree kelvin");
	}

}
