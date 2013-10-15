/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

//choosing random data to test the validity of the program
//because random data represents all potential risks for the values are random


import org.junit.* ;
import static org.junit.Assert.* ;


public class TemperatureTest {
	
	public static void main(String[]args){
		test_CelciusToKelvin();
		test_CelciusToKelvin2();
		test_FarenheitToKelvin();
		test_FarenheitToKelvin2();
		test_KelvinToCelsius();
		test_KelvinToCelsius2();
		test_KelvinToFahrenheit();
		test_KelvinToFahrenheit2();
		test_CelsiusToFahrenheit();
		test_FahrenheitToCelsius();
		
	}
   
	
	public static void test_CelciusToKelvin(){
		System.out.println("Test if temperature returns Kelvin...  ");
		Temperature T = new Temperature(20, Temperature.Units.CELSIUS);
		assertTrue(T.getUnits()==Temperature.Units.CELSIUS);
		//assertTrue(T.convertToKelvin(20)==293.15);	
		T.changeUnits(Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);
		assertTrue(T.getValue()==293.15);	
	}
//The code did not take the limit of Kelvin into consideration, the samllest value for Kelvin is 0K. 	
	//Thus, I created a new test method called Celsius, to see if kelvin 
	
	public static void test_CelciusToKelvin2(){
		System.out.println("Test if temperature returns Kelvin...  ");
		Temperature T = new Temperature(-283.15, Temperature.Units.CELSIUS);
		assertTrue(T.getUnits()==Temperature.Units.CELSIUS);	
		T.changeUnits(Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);
		assertTrue(T.getValue()==-10);	
	}
	
	public static void test_FarenheitToKelvin(){
		System.out.println("Test if temperature returns Kelvin...  ");
		Temperature T = new Temperature(8.33, Temperature.Units.FAHRENHEIT);
		assertTrue(T.getUnits()==Temperature.Units.FAHRENHEIT);
		//assertTrue(T.convertToKelvin(8.33)==260);		
		T.changeUnits(Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);		
		assertTrue(T.getValue()==260);
	}
	
//Since Kelvin cannot be a negative number, another test need to be done	
	public static void test_FarenheitToKelvin2(){
		System.out.println("Test if temperature returns Kelvin...  ");
		Temperature T = new Temperature(-500, Temperature.Units.FAHRENHEIT);
		assertTrue(T.getUnits()==Temperature.Units.FAHRENHEIT);
		T.changeUnits(Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);		
		assertTrue(T.getValue()==(-500 + 459.67) * 5.0/9.0);
	}
	
	
	public static void test_KelvinToCelsius(){
		System.out.println("Test if temperature returns Celcius...  ");
		Temperature T = new Temperature(0, Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);
		//assertTrue(T.convertFromKelvin(0)==-273.15);	
		T.changeUnits(Temperature.Units.CELSIUS);
		assertTrue(T.getUnits()==Temperature.Units.CELSIUS);
	    assertTrue(T.getValue()==-273.15);
	}
	
	
	//The code did not take the limit of Kelvin into consideration, the samllest value for Kelvin is 0K. 	
	//Thus, I created a new test method called Celsius, to see if kelvin 
	public static void test_KelvinToCelsius2(){
		System.out.println("Test if temperature returns Celcius...  ");
		Temperature T = new Temperature(-300, Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);
		T.changeUnits(Temperature.Units.CELSIUS);
		assertTrue(T.getUnits()==Temperature.Units.CELSIUS);
	    assertTrue(T.getValue()==-573.15);
	}

	
	
	public static void test_KelvinToFahrenheit(){
		System.out.println("Test if temperature returns Fahrenheit...  ");
		Temperature T = new Temperature(20, Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);
		T.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue(T.getUnits()==Temperature.Units.FAHRENHEIT);
		assertTrue(T.getValue()==(20* 9.0/5.0 - 459.67));		
	}
	
	//kelvin cannot be smaller than 0K.
	public static void test_KelvinToFahrenheit2(){
		System.out.println("Test if temperature returns Fahrenheit...  ");
		Temperature T = new Temperature(-20, Temperature.Units.KELVIN);
		assertTrue(T.getUnits()==Temperature.Units.KELVIN);
		T.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue(T.getUnits()==Temperature.Units.FAHRENHEIT);
		assertTrue(T.getValue()==(-20* 9.0/5.0 - 459.67));		
	}
	
	public static void test_CelsiusToFahrenheit(){
		System.out.println("Test if temperature returns Fahrenheit...");
		Temperature T=new Temperature(20, Temperature.Units.CELSIUS);
		assertTrue(T.getUnits()==Temperature.Units.CELSIUS);
		double temp = T.convertToKelvin(20);
		T.changeUnits(Temperature.Units.FAHRENHEIT);
		assertTrue(T.getUnits()==Temperature.Units.FAHRENHEIT);
		assertTrue(T.getValue()==temp * 9.0/5.0 - 459.67);	
	}
	
	public static void test_FahrenheitToCelsius(){
		System.out.println("Test if temperature returns Celsius...");
		Temperature T=new Temperature(20, Temperature.Units.FAHRENHEIT);
		assertTrue(T.getUnits()==Temperature.Units.FAHRENHEIT);
		double temp = T.convertToKelvin(20);
		T.changeUnits(Temperature.Units.CELSIUS);
		assertTrue(T.getUnits()==Temperature.Units.CELSIUS);
		assertTrue(T.getValue()==temp-273.15);	
	}
	
	
}
	

 
