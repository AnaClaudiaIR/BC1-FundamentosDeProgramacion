//Programa que convierta grados Celsius a Fahrenheit.

import java.util.Scanner;
public class CelaFah{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce los grados Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = celsius*1.8 + 32;
		System.out.println("Los grados en Fahrenheit son: " + fahrenheit);
	}
}
