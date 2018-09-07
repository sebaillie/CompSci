package refraction;

import java.util.Scanner;

public class Refraction {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// n1 * sin(theta1) = n2 * sin(theta2)
		
		System.out.print("Angle of incidence: ");
		double angleOI = s.nextDouble();
		System.out.print("Index of refraction: ");
		double medium2 = s.nextDouble();
		
		double answer = Math.asin(((1.000 / medium2) * (Math.sin(Math.toRadians(angleOI)))));
		double ans = Math.toDegrees(answer);
		
		System.out.printf("%.2f degrees", ans);
		
	}
	
}
