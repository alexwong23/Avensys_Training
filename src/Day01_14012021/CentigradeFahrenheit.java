package Day01_14012021;

public class CentigradeFahrenheit {
	
	public static double convertFahrenheit(double centigrade) {
		return (centigrade * 1.8 + 32); 
	}
	
	//	1. Write a program to read the temperature in centigrade and display the resultant in Fahrenheit.
	public static void main(String[] args) {
		double centigrade = 28.3;
		double fahrenheit = convertFahrenheit(centigrade);
		System.out.printf("The temperature %.1f is %.1f in fahrenheit", centigrade, fahrenheit);
	}
}
